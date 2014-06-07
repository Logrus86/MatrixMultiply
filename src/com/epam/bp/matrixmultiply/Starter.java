package com.epam.bp.matrixmultiply;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        System.out.println("Умножение прямоугольных матриц А и В размерности m*n и n*q соответственно." +'\n'+"Введите значения m,n,q, разделенные пробелами: ");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int q = in.nextInt();
        if ((m < 1) || (n < 1) || (q < 1)) {
            throw new IllegalArgumentException("Количество строк и/или столбцов не может быть меньше единицы.");
        }
        System.out.println("Генерируем матрицы. Матрица А размерности " + m + "*" + n + ":");
        Matrix A = new Matrix(m, n);
        A.fill();
        A.print();

        System.out.println("Матрица B размерности " + n + "*" + q + ":");
        Matrix B = new Matrix(n, q);
        B.fill();
        B.print();

        System.out.println("Произведением матриц A и B является матрица C размерностью " + m + "*" + q + ":");
        Matrix C = A.multiply(B);
        C.print();

    }


}
