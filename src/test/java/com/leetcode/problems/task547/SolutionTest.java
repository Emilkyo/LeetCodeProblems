package com.leetcode.problems.task547;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    public void firstTest() {
        int[][] array = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        Solution solution = new Solution();
        assertEquals(2, solution.findCircleNum(array));
    }

    @Test
    public void secondTest() {
        int[][] array = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Solution solution = new Solution();
        assertEquals(3, solution.findCircleNum(array));
    }
}