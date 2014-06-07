package com.epam.bp.matrixmultiply;

public class Matrix {

    private int[][] matrix;

    public Matrix(int rows,int cols) {
        matrix = new int[rows][cols];
    }

    public void fill() {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void print() {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix multiplier) {
        Matrix result = new Matrix(matrix.length, multiplier.matrix[0].length);
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < multiplier.matrix[0].length; ++j) {
                for (int k = 0; k < matrix[0].length; ++k) {
                    result.matrix[i][j] += matrix[i][k]*multiplier.matrix[k][j];
                }
            }
        }
        return result;
    }
}