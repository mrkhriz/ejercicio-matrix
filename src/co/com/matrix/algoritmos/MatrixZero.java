package co.com.matrix.algoritmos;

import java.util.Scanner;

public class MatrixZero {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresar numero:");
        int A = reader.nextInt();

        Solution solution = new Solution(A);
        solution.solucion1();

    }
}