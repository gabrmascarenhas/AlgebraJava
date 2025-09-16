import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Parte 1--------------------");

        Matrix m = new Matrix(3, 3, new double[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        m.print();
        System.out.println();
        System.out.println("[1][3]: " + m.getElements(0, 2));
        System.out.println();
        m.setElements(0, 2, 31);
        System.out.println("Set [1][3] = 31: ");
        m.print();
        System.out.println();

        System.out.println("--------------------Parte 2--------------------");

        Vector v = new Vector(9, new double[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        v.print();
        System.out.println();
        System.out.println("[4]: " + v.getElements(3));
        System.out.println();

        v.setElements(3, 41);
        System.out.println("[4] = 41: ");
        v.print();
        System.out.println();

        System.out.println("--------------------Parte 3--------------------");

        System.out.println("Matriz m:");
        m.print();
        System.out.println();

        System.out.println("Matriz m transposta:");
        Matrix mTrans = LinearAlgebra.transpose(m);
        mTrans.print();
        System.out.println();

        System.out.println("Vetor v:");
        v.print();
        System.out.println();

        System.out.println("Vetor v transposta:");
        Vector vTrans = LinearAlgebra.transpose(v);
        System.out.println();

        System.out.println("Soma de matrizes:");
        Matrix a = new Matrix(3, 3, new double[]{100, 200, 300, 400, 500, 600, 700, 800, 900});
        Matrix b = new Matrix(3, 3, new double[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        System.out.println("Matriz A: ");
        a.print();
        System.out.println();
        System.out.println("Matriz B: ");
        b.print();
        System.out.println();
        System.out.println("Soma:");
        Matrix sumMatrix = LinearAlgebra.sum(a, b);
        sumMatrix.print();
        System.out.println();

        System.out.println("Soma de Vetores:");
        Vector a1 = new Vector(9, new double[]{100, 200, 300, 400, 500, 600, 700, 800, 900});
        Vector b1 = new Vector(9, new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("Vetor A: ");
        a1.print();
        System.out.println();
        System.out.println("Vetor B: ");
        b1.print();
        System.out.println();
        System.out.println("Soma: ");
        Vector sumVector = LinearAlgebra.sum(a1, b1);
        sumVector.print();
        System.out.println();

        System.out.println("Produto de matrizes e vetores:");
        Matrix b12 = new Matrix(3, 2, new double[]{10, 20, 30, 40, 50, 60});
        System.out.println();
        Matrix timesMatrix = LinearAlgebra.times(a, b);
        timesMatrix.print();
        System.out.println();
        Matrix dotMatrix = LinearAlgebra.dot(a, b12);
        dotMatrix.print();
        System.out.println();

        Matrix a12 = new Matrix(3, 4, new double[]{
                2, -2, 0, -6,
                1, -1, 1, 1,
                0, 3, -2, -5});
        Matrix gaussMatrix = LinearAlgebra.gauss(a12);
        gaussMatrix.print();
        System.out.println("Exemplo com pivô zero");
        Matrix a13 = new Matrix(3, 3, new double[]{
                0, -2, 0,
                1, 1, 1,
                0, 3, -2});
        Matrix gaussMatrix1 = LinearAlgebra.gauss(a13);
        gaussMatrix1.print();
        System.out.println("Gauss-Jacob");
        System.out.println("Usando o exemplo do segundo exercício do desafio 4:");
        Matrix a14 = new Matrix(3, 4, new double[]{
                1, 1, 2, 9,
                2, 4, -3, 1,
                3, 6, -5, 0});
        Matrix solveMatrix = LinearAlgebra.solve(a14);
        solveMatrix.print();
        System.out.println("X = " + solveMatrix.getElements(0, 3) + ", Y = " + solveMatrix.getElements(1, 3) + ", Z = " + solveMatrix.getElements(2, 3));
    }
}
