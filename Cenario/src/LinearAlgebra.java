public class LinearAlgebra {

    public static Matrix transpose(Matrix m) {
        Matrix mTrans = new Matrix(m.getCols(), m.getRows(), new double[m.getRows() * m.getCols()]);
        for (int i = 0; i < m.getRows(); i++) {
            for (int j = 0; j < m.getCols(); j++) {
                mTrans.setElements(j, i, m.getElements(i, j));
            }
        }
        return mTrans;
    }

    public static Vector transpose(Vector v) {
        return new Vector(v.getDim(), v.getAllElements());
    }

    public static Matrix sum(Matrix a, Matrix b) {
        Matrix sumMatrix = new Matrix(a.getRows(), a.getCols(), new double[a.getRows() * a.getCols()]);
        if (a.getRows() == b.getRows() && a.getCols() == b.getCols()) {
            for (int i = 0; i < a.getRows(); i++) {
                for (int j = 0; j < a.getCols(); j++) {
                    sumMatrix.setElements(i, j, a.getElements(i, j) + b.getElements(i, j));
                }
            }
        }
        return sumMatrix;
    }

    public static Vector sum(Vector a, Vector b) {
        Vector sumVector = new Vector(a.getDim(), new double[a.getDim()]);
        if (a.getDim() == b.getDim()) {
            for (int i = 0; i < a.getDim(); i++) {
                sumVector.setElements(i, a.getElements(i) + b.getElements(i));
            }
        }
        return sumVector;
    }

    public static Matrix times(Matrix a, Matrix b) {
        Matrix result = new Matrix(a.getRows(), b.getCols(), new double[a.getRows() * b.getCols()]);
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                result.setElements(i, j, a.getElements(i, j) * b.getElements(i, j));
            }
        }
        return result;
    }

    public static Vector times(Vector a, Vector b) {
    Vector result = new Vector(a.getDim(), new double[a.getDim()]);
    if (a.getDim() == b.getDim()) {
        for (int i = 0; i < a.getDim(); i++) {
            result.setElements(i, a.getElements(i) * b.getElements(i));
        }
    }
    return result;
    }

    public static Matrix times(double escalar, Matrix a) {
    Matrix result = new Matrix(a.getRows(), a.getCols(), new double[a.getRows() * a.getCols()]);
    for (int i = 0; i < a.getRows(); i++) {
        for (int j = 0; j < a.getCols(); j++) {
            result.setElements(i, j, escalar * a.getElements(i, j));
        }
    }
    return result;
    }


    public static Matrix dot(Matrix a, Matrix b) {
        Matrix result = new Matrix(a.getRows(), b.getCols(), new double[a.getRows() * b.getCols()]);
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                double soma = 0;
                for (int k = 0; k < a.getCols(); k++) {
                    soma += a.getElements(i, k) * b.getElements(k, j);
                }
                result.setElements(i, j, soma);
            }
        }
        return result;
    }

    public static Matrix gauss(Matrix a) {
        Matrix gaussMatrix = new Matrix(a.getRows(), a.getCols(), new double[a.getRows() * a.getCols()]);
        for (int i = 0; i < a.getRows(); i++)
            for (int j = 0; j < a.getCols(); j++)
                gaussMatrix.setElements(i, j, a.getElements(i, j));
        int rows = gaussMatrix.getRows();
        for(int i = 0; i < rows; i++) {
                double pivot = gaussMatrix.getElements(i, i);

                // Se pivô = 0, trocar linha
                if (pivot == 0) {
                    for (int r = i + 1; r < rows; r++) {
                        if (gaussMatrix.getElements(r, i) != 0) {
                            // troca as linhas i e r
                            for (int c = 0; c < gaussMatrix.getCols(); c++) {
                                double temp = gaussMatrix.getElements(i, c);
                                gaussMatrix.setElements(i, c, gaussMatrix.getElements(r, c));
                                gaussMatrix.setElements(r, c, temp);
                            }
                            break;
                        }
                    }
                    pivot = gaussMatrix.getElements(i, i);
                }

                // Se depois da troca ainda for 0, pula
                if (pivot == 0) continue;

            for (int j = i + 1; j < rows; j++) {
                double fator = gaussMatrix.getElements(j, i) / pivot;
                for (int k = i; k < gaussMatrix.getCols(); k++) {
                    double newElement = gaussMatrix.getElements(j, k) - fator * gaussMatrix.getElements(i, k);
                    gaussMatrix.setElements(j, k, newElement);
                }
            }
        }
        return gaussMatrix;
    }
    public static Matrix solve(Matrix a) {
        Matrix solveMatrix = new Matrix(a.getRows(), a.getCols(), new double[a.getRows() * a.getCols()]);

        // Copiar matriz
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                solveMatrix.setElements(i, j, a.getElements(i, j));
            }
        }

        int rows = solveMatrix.getRows();
        int cols = solveMatrix.getCols();

        // Eliminação de Gauss-Jordan
        for (int i = 0; i < rows; i++) {
            double pivot = solveMatrix.getElements(i, i);

            // Se pivô = 0, trocar linha (mesmo que no gauss)
            if (pivot == 0) {
                for (int r = i + 1; r < rows; r++) {
                    if (solveMatrix.getElements(r, i) != 0) {
                        for (int c = 0; c < solveMatrix.getCols(); c++) {
                            double temp = solveMatrix.getElements(i, c);
                            solveMatrix.setElements(i, c, solveMatrix.getElements(r, c));
                            solveMatrix.setElements(r, c, temp);
                        }
                        break;
                    }
                }
                pivot = solveMatrix.getElements(i, i);
            }

            // Se ainda for 0, pula
            if (pivot == 0) continue;

            // Normalizar linha do pivô
            for (int c = i; c < cols; c++) {
                solveMatrix.setElements(i, c, solveMatrix.getElements(i, c) / pivot);
            }

            // Zerar todos os outros elementos da coluna
            for (int r = 0; r < rows; r++) {
                if (r != i) {
                    double factor = solveMatrix.getElements(r, i);
                    for (int c = i; c < cols; c++) {
                        double newValue = solveMatrix.getElements(r, c) - factor * solveMatrix.getElements(i, c);
                        solveMatrix.setElements(r, c, newValue);
                    }
                }
            }
        }

        return solveMatrix;
    }
}
