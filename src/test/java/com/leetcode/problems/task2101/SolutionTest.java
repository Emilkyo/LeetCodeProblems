package com.leetcode.problems.task2101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void maximumDetonationTest1() {
        int[][] array = {{2, 1, 3}, {6, 1, 4}};
        assertEquals(2, solution.maximumDetonation(array));
    }

    @Test
    void ifDistanceIsMuchThanInteger() {
        int[][] array = {{1, 1, 100000}, {100000, 100000, 1}};
        assertEquals(1, solution.maximumDetonation(array));
    }

    @Test
    void ifBombsIsNull() {
        assertEquals(0, solution.maximumDetonation(null));
    }
}