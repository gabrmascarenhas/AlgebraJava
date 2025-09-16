public class Matrix {
    private int rows;
    private int cols;
    private double[] elements;
    private double[][] matrix;

    public Matrix(int rows, int cols, double[] elements) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new double[rows * cols];
        this.matrix = new double[rows][cols];

        int cont = 0;
        for (int i = 0; i < rows * cols; i++) {
            this.elements[i] = elements[i];
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = elements[cont++];
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

    public double getElements(int i, int j) { return matrix[i][j]; }
    public void setElements(int i, int j, double value) { matrix[i][j] = value; }
    public int getRows() { return rows; }
    public int getCols() { return cols; }
    public double[] getAllElements() { return elements; }
}
