import java.util.Arrays;

public class LinearAlgebra {
    /* static: metodo pertencente á classe, e pode ser chamada sem precisar criar
     * um objeto */

    public static Matrix transpose(Matrix m){
        Matrix mTrans = new Matrix(m.getCols(), m.getRows(),new float[m.getRows() * m.getCols()]);
        for(int j = 0; j < m.getRows(); j++){
            for(int k = 0; k < m.getCols(); k++){
                mTrans.setElements(k, j, m.getElements(j, k));
            }
        }
        return mTrans;
    }


    public static Vector transpose(Vector v){
        Vector vTrans = new Vector(v.getDim(), v.getAllElements());
        System.out.println("dim = " + v.getDim());
        for(int i = 0; i < v.getDim(); i++) {
            System.out.println(v.getElements(i));
        }
        return vTrans;
    }

    public static Matrix sum(Matrix a, Matrix b){
        Matrix sum = new Matrix(a.getRows(), b.getCols(),new float[a.getRows() * b.getCols()]);
        if(a.getCols() == b.getCols() && a.getRows() == b.getRows()){
            for(int j = 0; j < a.getRows(); j++){
                for(int k = 0; k < b.getCols(); k++){
                    sum.setElements(j, k, (a.getElements(j, k) + b.getElements(j, k)));
                }
            }
            return sum;

        } else {


            return sum;
        }

    }
   // public static Vector sum(Vector a, Vector b){

  //  }

}
