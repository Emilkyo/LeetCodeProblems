package com.leetcode.problems.task1091;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void printArray() {
        var solution = new Solution();
        int[][] array = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertEquals("0 0 0 \n1 1 0 \n1 1 0 \n", solution.printArray(array));
    }

    @Test
    public void shortestPathEqualsTwo() {
        int[][] array = {{0, 1}, {1, 0}};
        var solution = new Solution();
        assertEquals(2, solution.shortestPathBinaryMatrix(array));
    }

    @Test
    public void shortestPathEqualsFour() {
        int[][] array = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        var solution = new Solution();
        assertEquals(4, solution.shortestPathBinaryMatrix(array));
    }

    @Test
    public void shortestPathEqualsMinusOne() {
        int[][] array = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        var solution = new Solution();
        assertEquals(-1, solution.shortestPathBinaryMatrix(array));
    }
}