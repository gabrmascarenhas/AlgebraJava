import java.util.Scanner;

public class Matrix {
    private int rows;
    private int cols;
    private float[] elements;
    private int total;
    private int cont = 0;
    private float[][] matrix;

    public Matrix(int rows, int cols, float[] elements) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new float[rows * cols];
        this.matrix = new float[rows][cols];

        for (int i = 0; i < (rows * cols) ; i++) {
            this.elements[i] = elements[i];
        }
        for(int j = 0; j < rows; j++){
            for(int k = 0; k < cols; k++){
                matrix[j][k] = elements[cont];
                cont++;
            }
        }


    }
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public float getElements(int i, int j) {
        return matrix[i][j];
    }

    public void setElements(int i, int j, float value) {
        matrix[i][j] = value;
    }



}

