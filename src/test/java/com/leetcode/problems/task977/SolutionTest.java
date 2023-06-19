package com.leetcode.problems.task977;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void test1() {
        int[] input = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};
        var solution = new Solution();
        assertArrayEquals(expected, solution.sortedSquares(input));
    }

    @Test
    void test2() {
        int[] input = new int[]{-7, -3, 2, 3, 11};
        int[] expected = new int[]{4, 9, 9, 49, 121};
        var solution = new Solution();
        assertArrayEquals(expected, solution.sortedSquares(input));
    }
}