package com.leetcode.problems.task2352;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void firstTest() {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        var solution = new Solution();
        assertEquals(1, solution.equalPairs(grid));
    }

    @Test
    void secondTest() {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        var solution = new Solution();
        assertEquals(3, solution.equalPairs(grid));
    }

    @Test
    void anotherTest() {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 4}, {2, 4, 2, 2}, {2, 5, 2, 2}};
        var solution = new Solution();
        assertEquals(3, solution.equalPairs(grid));
    }
}