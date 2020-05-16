package co.com.matrix.funciones.impl;
import co.com.matrix.funciones.interfaz.Funciones;

public class ImplFunciones implements Funciones {

    public int[][] llenarMatriz (int B[][]){

        for (int i=0;i<B.length;i++){
            for (int j=0;j<B.length;j++){
                B[i][j] = (int)(Math.random()*50+10);
            }
        }
        return B;
    }

    public int[][] diagonales (int [][] A){

        for (int i=0;i<A.length;i++){
            for (int j=0;j<A.length;j++){

                if (i == j){
                    A[i][j] = 0;
                }
                if(i+j == A.length-1){
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

    public void imprimirMatriz (int[][] A){

        for (int i=0;i<A.length;i++){
            for (int j=0;j<A.length;j++){
                System.out.print (" ["+A[i][j]+"]   ");
            }
            System.out.println();
        }
        System.out.println();
    }

}