package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalTest {

    MatrixDiagonal obj = new MatrixDiagonal();

    @Test
    public void diagonal_test() {
        assertArrayEquals(new int[]{0, 5, 1}, obj.getDiagonal(new int[][]{{0, 1, 2}, {4, 5, 6}, {1, 1, 1}}));
    }

    @Test
    public void counter_diagonal_test(){
        assertArrayEquals(new int[]{2, 5, 1}, obj.getCounterDiagonal(new int[][]{{0, 1, 2}, {4, 5, 6}, {1, 1, 1}}));
    }
}