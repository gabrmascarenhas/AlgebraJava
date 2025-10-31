public class Transformations {


    public static Vector translate2D(Vector vetor, double dx, double dy) {
        Matrix T = new Matrix(3, 3, new double[]{1, 0, dx, 0, 1, dy, 0, 0, 1});
        Matrix P = new Matrix(3, 1, new double[]{vetor.getElements(0), vetor.getElements(1), 1});
        Matrix translatedVectorAsMatrix = LinearAlgebra.dot(T, P);
        Vector translatedVector2D = new Vector(3, new double[]{
                translatedVectorAsMatrix.getElements(0, 0),
                translatedVectorAsMatrix.getElements(1, 0),
                translatedVectorAsMatrix.getElements(2, 0)
        });
        return translatedVector2D;
    }

    public static Vector translate3D(Vector vetor, double dx, double dy, double dz) {
        Matrix T = new Matrix(4, 4, new double[]{1, 0, 0, dx, 0, 1, 0, dy, 0, 0, 1, dz, 0, 0, 0, 1});
        Matrix P = new Matrix(4, 1, new double[]{vetor.getElements(0), vetor.getElements(1), vetor.getElements(2), 1});
        Matrix translatedVectorAsMatrix = LinearAlgebra.dot(T, P);
        Vector translatedVector3D = new Vector(3, new double[]{
                translatedVectorAsMatrix.getElements(0, 0),
                translatedVectorAsMatrix.getElements(1, 0),
                translatedVectorAsMatrix.getElements(2, 0),
                translatedVectorAsMatrix.getElements(3, 0)
        });
        return translatedVector3D;
    }




    public static Vector rotate2d(Vector vetor, double alpha) {

        double angleRad = Math.toRadians(alpha); // converte graus → radianos
        double cos = Math.cos(angleRad);
        double sin = Math.sin(angleRad);

        Matrix T = new Matrix(3, 3, new double[]
                                {cos, -sin, 0,
                                sin, cos, 0,
                                0, 0, 1});
        Matrix P = new Matrix(3, 1, new double[]{vetor.getElements(0), vetor.getElements(1), 1});

        Matrix rotatedVectorAsMatrix = LinearAlgebra.dot(T, P);
        Vector rotatedVector2d = new Vector(3, new double[]{
                rotatedVectorAsMatrix.getElements(0, 0),
                rotatedVectorAsMatrix.getElements(1, 0),
                rotatedVectorAsMatrix.getElements(2, 0)
        });

        return rotatedVector2d;
    }

    public static Vector rotate3dx(Vector vetor, double alpha) {
        double angleRad = Math.toRadians(alpha);
        double cos = Math.cos(angleRad);
        double sin = Math.sin(angleRad);

        Matrix T = new Matrix(4, 4, new double[]{
                1, 0, 0, 0,
                0, cos, -sin, 0,
                0, sin, cos, 0,
                0, 0, 0, 1
        });

        Matrix P = new Matrix(4, 1, new double[]{
                vetor.getElements(0),
                vetor.getElements(1),
                vetor.getElements(2),
                1
        });

        Matrix rotatedVectorAsMatrix = LinearAlgebra.dot(T, P);
        Vector rotatedVector3dx = new Vector(4, new double[]{
                rotatedVectorAsMatrix.getElements(0, 0),
                rotatedVectorAsMatrix.getElements(1, 0),
                rotatedVectorAsMatrix.getElements(2, 0),
                rotatedVectorAsMatrix.getElements(3, 0)
        });

        return rotatedVector3dx;
    }


    public static Vector rotate3dy(Vector vetor, double alpha) {
        double angleRad = Math.toRadians(alpha);
        double cos = Math.cos(angleRad);
        double sin = Math.sin(angleRad);

        Matrix T = new Matrix(4, 4, new double[]{
                cos, 0, sin, 0,
                0, 1, 0, 0,
                -sin, 0, cos, 0,
                0, 0, 0, 1
        });

        Matrix P = new Matrix(4, 1, new double[]{
                vetor.getElements(0),
                vetor.getElements(1),
                vetor.getElements(2),
                1
        });

        Matrix rotatedVectorAsMatrix = LinearAlgebra.dot(T, P);
        Vector rotatedVector3dy = new Vector(4, new double[]{
                rotatedVectorAsMatrix.getElements(0, 0),
                rotatedVectorAsMatrix.getElements(1, 0),
                rotatedVectorAsMatrix.getElements(2, 0),
                rotatedVectorAsMatrix.getElements(3, 0)
        });

        return rotatedVector3dy;
    }

    public static Vector rotate3dz(Vector vetor, double alpha) {
        double angleRad = Math.toRadians(alpha);
        double cos = Math.cos(angleRad);
        double sin = Math.sin(angleRad);

        Matrix T = new Matrix(4, 4, new double[]{
                cos, -sin, 0, 0,
                sin, cos, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1
        });

        Matrix P = new Matrix(4, 1, new double[]{
                vetor.getElements(0),
                vetor.getElements(1),
                vetor.getElements(2),
                1
        });

        Matrix rotatedVectorAsMatrix = LinearAlgebra.dot(T, P);
        Vector rotatedVector3dz = new Vector(4, new double[]{
                rotatedVectorAsMatrix.getElements(0, 0),
                rotatedVectorAsMatrix.getElements(1, 0),
                rotatedVectorAsMatrix.getElements(2, 0),
                rotatedVectorAsMatrix.getElements(3, 0)
        });

        return rotatedVector3dz;
    }

}







