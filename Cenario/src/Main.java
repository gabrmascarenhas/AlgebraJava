public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Parte 1--------------------");

        Matrix m = new Matrix(3, 3, new float[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        m.print();
        System.out.println(m.getElements(1, 2));
        m.setElements(1,2, 31);
        m.print();

        System.out.println("--------------------Parte 2--------------------");

        Vector v = new Vector(9, new float[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        v.print();
        System.out.println(v.getElements(4));
        v.setElements(4, 51);
        v.print();

    }
}