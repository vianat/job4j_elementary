package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] matrix) {
        int result = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int cell = 0; cell < matrix[row].length; cell++) {
                result += matrix[row][cell];
                System.out.println(result);
            }
        }
        return result;
    }
}
