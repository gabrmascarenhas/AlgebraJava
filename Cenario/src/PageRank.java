import java.util.Arrays;

public class PageRank {

    public static void runPageRank(Matrix A) {

        int n = A.getRows();

        String[] names = new String[n];
        for(int count = 0; count<n; count++){
            names[count] = "Site" + (count + 1) + ".com";
        }

        // Vetor de soma das linhas (hubs)
        Vector h0 = new Vector(n, new double[n]);
        for (int i = 0; i < n; i++) {
            double soma = 0;
            for (int j = 0; j < n; j++) {
                soma += A.getElements(i, j);
            }
            h0.setElements(i, soma);
        }

        // Vetor de soma das colunas (autoridades)
        Vector a0 = new Vector(n, new double[n]);
        for (int j = 0; j < n; j++) {
            double soma = 0;
            for (int i = 0; i < n; i++) {
                soma += A.getElements(i, j);
            }
            a0.setElements(j, soma);
        }

        double tol = 0.0001;
        Vector an = a0;
        Vector hn = h0;

        Matrix Atrans = LinearAlgebra.transpose(A);

        for (int it = 1; it <= 1000; it++) {

            Matrix a0M = new Matrix(n, 1, a0.getAllElements());
            Matrix u = LinearAlgebra.dot(A, a0M);
            hn = normalizeVectorFromMatrix(u);

            Matrix h0M = new Matrix(n, 1, hn.getAllElements());
            Matrix v = LinearAlgebra.dot(Atrans, h0M);
            an = normalizeVectorFromMatrix(v);

            double maxError = 0;
            for (int i = 0; i < n; i++) {
                double erro = Math.abs(an.getElements(i) - a0.getElements(i));
                maxError = Math.max(maxError, erro);
            }

            if (maxError <= tol) break;
            a0 = an;
        }

        double[] valores = an.getAllElements(); // vetor de autoridade

// fazendo sort
        for (int i = 1; i < n; i++) {
            double keyVal = valores[i];
            String keyName = names[i];
            int j = i - 1;


            while (j >= 0 && valores[j] < keyVal) {
                valores[j + 1] = valores[j];
                names[j + 1] = names[j];
                j--;
            }
            valores[j + 1] = keyVal;
            names[j + 1] = keyName;
        }

        
        System.out.println("Autoridade final (ordenada decrescente):");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + ": " + valores[i]);
        }
    }

    private static Vector normalizeVectorFromMatrix(Matrix m) {
        double soma = 0;
        for (int i = 0; i < m.getRows(); i++) {
            soma += Math.pow(m.getElements(i, 0), 2);
        }
        double norma = Math.sqrt(soma);

        double[] vec = new double[m.getRows()];
        for (int i = 0; i < m.getRows(); i++) {
            vec[i] = m.getElements(i, 0) / norma;
        }
        return new Vector(m.getRows(), vec);
    }
}
