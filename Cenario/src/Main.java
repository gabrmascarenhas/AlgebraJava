public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Parte 1--------------------");

        Matrix m = new Matrix(3, 3, new float[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        m.print();
        System.out.println();
        System.out.println("[1][3]: "+ m.getElements(0, 2));
        System.out.println();
        m.setElements(0,2, 31);
        System.out.println("Set [1][3] = 31: ");
        m.print();
        System.out.println();

        System.out.println("--------------------Parte 2--------------------");

        Vector v = new Vector(9, new float[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        v.print();
        System.out.println();
        System.out.println("[4]: "+ v.getElements(3));
        System.out.println();

        v.setElements(3, 41);
        System.out.println("[4] = 41: ");
        v.print();
        System.out.println();

        System.out.println("--------------------Parte 3--------------------");

        System.out.println("Matriz m:");
        System.out.println();

        m.print();

        System.out.println();
        System.out.println("Matriz m transposta:");
        System.out.println();

        Matrix mTrans = LinearAlgebra.transpose(m);
        mTrans.print();

        System.out.println();
        System.out.println("Vetor v:");
        System.out.println();

        v.print();

        System.out.println();
        System.out.println("Vetor v transposta:");
        System.out.println();

        Vector vTrans = LinearAlgebra.transpose(v);
        System.out.println();

        System.out.println("Soma de matrizes:");

        Matrix a = new Matrix(3, 3, new float[]{100, 200, 300, 400, 500, 600, 700, 800, 900});
        Matrix b = new Matrix(3, 3, new float[]{10, 20, 30, 40, 50, 60, 70, 80, 90});

        System.out.println("Matriz A: ");
        a.print();

        System.out.println();

        System.out.println("Matriz B: ");
        b.print();

        System.out.println();

        System.out.println("Soma:");

        Matrix sum = LinearAlgebra.sum(a, b);
        sum.print();
    }
}