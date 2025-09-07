import java.util.Arrays;

public class Vector {
    private int dim;
    private float [] vector;
    private float[] elements;
    private float value;

    public Vector(int dim, float[] elements) {
        this.dim = dim;
        this.elements = new float[elements.length];
        for (int i = 0; i < elements.length; i++) {
            this.elements[i] = elements[i];
        }
    }

    public float getElements(int i) {
        return elements[i];
    }

    public void setElements(int i, float value) {
        elements[i] =  value;
    }

    public void print(){

        System.out.println("dim = " + dim);
        System.out.println(Arrays.toString(elements));
    }
}
