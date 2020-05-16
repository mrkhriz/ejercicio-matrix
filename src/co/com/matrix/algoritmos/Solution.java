package co.com.matrix.algoritmos;
import co.com.matrix.funciones.impl.ImplFunciones;
import co.com.matrix.funciones.interfaz.Funciones;

public class Solution {

    private int B[][];

    public Solution(int A) {

        this.B = new int[A][A];

    }

    public void solucion1 (){

        Funciones funciones = new ImplFunciones();
        this.B = funciones.llenarMatriz(this.B);
        funciones.imprimirMatriz(this.B);
        funciones.diagonales(this.B);
        funciones.imprimirMatriz(this.B);
    }

    public int[][] getB() {
        return this.B;
    }

    public void setB(int[][] b) {
        this.B = b;
    }
}