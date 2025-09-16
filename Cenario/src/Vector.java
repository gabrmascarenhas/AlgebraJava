import java.util.Arrays;

public class Vector {
    private int dim;
    private double[] elements;

    public Vector(int dim, double[] elements) {
        this.dim = dim;
        this.elements = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            this.elements[i] = elements[i];
        }
    }

    public double getElements(int i) { return elements[i]; }
    public void setElements(int i, double value) { elements[i] = value; }
    public void print() {
        System.out.println("dim = " + dim);
        System.out.println(Arrays.toString(elements));
    }
    public int getDim() { return dim; }
    public double[] getAllElements() { return elements; }
}
