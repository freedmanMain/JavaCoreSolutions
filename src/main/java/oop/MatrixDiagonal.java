package oop;

public class MatrixDiagonal {

    /**
     * Write implementation of methods:
     * getDiagonal()
     * getCounterDiagonal()
     * The input parameter int[][] matrix represents
     * square matrix, so its height is always equals to its width.
     * */

    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int y = 0; y < diagonal.length; y++) {
            diagonal[y] = matrix[y][y];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int y = 0, x = matrix.length - 1; y < counterDiagonal.length; y++, x--) {
            counterDiagonal[y] = matrix[y][x];
        }
        return counterDiagonal;
    }
}
