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
        vTrans.print();
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










        //CENÁRIO 2
        System.out.println();
        System.out.printf("Cenário 2");
        System.out.println();


        Vector vetor2d = new Vector(3, new double[] {2, 3, 1}); //DEFINIÇÃO DO VETOR 2D
        Vector vetor3d = new Vector(4, new double[] {2, 3, 4, 1}); //DEFINIÇÃO DO VETOR 3D





        //TRANSLAÇÃO
        Vector vetor2dtranslate = Transformations.translate2D(vetor2d, 5, 5);

        System.out.println();

        System.out.println("Vetor 2D transladado: ");
        vetor2dtranslate.print();

        Vector vetor3dtranslate = Transformations.translate3D(vetor3d, 5, 5 ,5);

        System.out.println();

        System.out.println("Vetor 3D transladado: ");
        vetor3dtranslate.print();

        System.out.println();





        //ROTAÇÃO
        Vector vetor2Drotate = Transformations.rotate2d(vetor2d, 60);
        Vector vetor3DrotateX = Transformations.rotate3dx(vetor3d, 60);
        Vector vetor3DrotateY = Transformations.rotate3dy(vetor3d, 60);
        Vector vetor3DrotateZ = Transformations.rotate3dz(vetor3d, 60);

        System.out.println();

        System.out.println("Vetor de rotação 2D: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f]%n",
                vetor2Drotate.getElements(0),
                vetor2Drotate.getElements(1)
        );

        System.out.println();

        System.out.println("Vetor de rotação 3D no eixo x: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3DrotateX.getElements(0),
                vetor3DrotateX.getElements(1),
                vetor3DrotateX.getElements(2)
        );

        System.out.println();

        System.out.println("Vetor de rotação 3D no eixo y: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3DrotateY.getElements(0),
                vetor3DrotateY.getElements(1),
                vetor3DrotateY.getElements(2)
        );

        System.out.println();

        System.out.println("Vetor de rotação 3D no eixo z: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3DrotateZ.getElements(0),
                vetor3DrotateZ.getElements(1),
                vetor3DrotateZ.getElements(2)
        );




        //REFLEXÃO
        Vector vetor2DreflexedX = Transformations.reflection2DX(vetor2d);

        System.out.println();

        System.out.println("Vetor de reflexão 2D no eixo X: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f]%n",
                vetor2DreflexedX.getElements(0),
                vetor2DreflexedX.getElements(1)
        );

        Vector vetor2DreflexedY = Transformations.reflection2DY(vetor2d);

        System.out.println();

        System.out.println("Vetor de reflexão 2D no eixo Y: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f]%n",
                vetor2DreflexedY.getElements(0),
                vetor2DreflexedY.getElements(1)
        );

        Vector vetor3DreflexedX = Transformations.reflection3DX(vetor3d);
        System.out.println();

        System.out.println("Vetor de reflexão 3D no eixo X: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3DreflexedX.getElements(0),
                vetor3DreflexedX.getElements(1),
                vetor3DreflexedX.getElements(2)
        );

        Vector vetor3DreflexedY = Transformations.reflection3DY(vetor3d);

        System.out.println();

        System.out.println("Vetor de reflexão 3D no eixo Y: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3DreflexedY.getElements(0),
                vetor3DreflexedY.getElements(1),
                vetor3DreflexedY.getElements(2)
        );

        Vector vetor3DreflexedZ = Transformations.reflection3DZ(vetor3d);

        System.out.println();

        System.out.println("Vetor de reflexão 3D no eixo Z: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3DreflexedZ.getElements(0),
                vetor3DreflexedZ.getElements(1),
                vetor3DreflexedZ.getElements(2)
        );




        //PROJEÇÃO
        Vector vetor2dprojectedX = Transformations.projection2DX(vetor2d);

        System.out.println();

        System.out.println("Vetor de projeção 2D no eixo X: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f]%n",
                vetor2dprojectedX.getElements(0),
                vetor2dprojectedX.getElements(1)
        );

        Vector vetor2dprojectedY = Transformations.projection2DY(vetor2d);

        System.out.println();

        System.out.println("Vetor de projeção 2D no eixo Y: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f]%n",
                vetor2dprojectedY.getElements(0),
                vetor2dprojectedY.getElements(1)
        );

        Vector vetor3dprojectedX= Transformations.projection3DX(vetor3d);

        System.out.println();

        System.out.println("Vetor de projeção 3D no eixo X: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3dprojectedX.getElements(0),
                vetor3dprojectedX.getElements(1),
                vetor3dprojectedX.getElements(2)
        );

        Vector vetor3dprojectedY = Transformations.projection3DY(vetor3d);

        System.out.println();

        System.out.println("Vetor de projeção 3D no eixo Y: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3dprojectedY.getElements(0),
                vetor3dprojectedY.getElements(1),
                vetor3dprojectedY.getElements(2)
        );

        Vector vetor3dprojectedZ = Transformations.projection3DZ(vetor3d);

        System.out.println();

        System.out.println("Vetor de projeção 3D no eixo Z: ");

        System.out.println();

        System.out.printf("[%.4f, %.4f, %.4f]%n",
                vetor3dprojectedZ.getElements(0),
                vetor3dprojectedZ.getElements(1),
                vetor3dprojectedZ.getElements(2)
        );




        //CISALHAMENTO
        Vector vetor2dshearing = Transformations.shearing(vetor2d, 1, 0.5);

        System.out.println("Cisalhamento de vetor 2D:");
        System.out.println();

        System.out.printf("[%.4f, %.4f]%n",
                vetor2dshearing.getElements(0),
                vetor2dshearing.getElements(1)
        );


        //Cenário 3: 02/12/25
        System.out.println("Cenário 3 ---------------------------------------------------");
        double[] A5elements = {
                0, 0, 1, 0,
                1, 0, 0, 0,
                1, 1, 0, 0,
                0, 1, 0, 0
        };
        Matrix A5 = new Matrix(4, 4, A5elements);
        System.out.println();
        System.out.println("Hits Exercício 5");
        Hits.runHITS(A5);
        System.out.println();
        double[] A6elements = {
                0, 1, 1, 0,
                0, 0, 1, 0,
                1, 0, 0, 1,
                1, 0, 0, 0
        };
        Matrix A6 = new Matrix(4, 4, A6elements);
        System.out.println();
        System.out.println("Hits Exercício 6");
        Hits.runHITS(A6);
        System.out.println();

        double[] A7elements = {
                0, 1, 1, 1, 0,
                1, 0, 0, 0, 1,
                0, 0, 0, 0, 1,
                0, 1, 0, 0, 0,
                0, 1, 1, 0, 0
        };
        Matrix A7 = new Matrix(5, 5, A7elements);
        System.out.println();
        System.out.println("Hits Exercício 7");
        Hits.runHITS(A7);
        System.out.println();

        double[] A8elements = {
                0,1,1,0,1,1,0,0,0,1,
                0,0,1,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,1,
                0,1,1,0,0,1,1,0,0,1,
                0,0,0,1,0,0,0,0,0,0,
                0,1,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,1,0,
                0,0,0,0,0,1,0,0,0,0,
                0,1,1,0,0,1,0,1,0,1,
                0,0,0,0,0,1,0,0,0,0
        };
        Matrix A8 = new Matrix(10, 10, A8elements);
        System.out.println();
        System.out.println("Hits Exercício 8");
        Hits.runHITS(A8);


    }
}
