package com.leetcode.problems.task1491;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void averageExcludeMinMaxForFirstArray() {
        var solution = new Solution();
        int[] salary = {4000, 3000, 1000, 2000};
        assertEquals(2500, solution.averageExcludeMinMax(salary));
    }
    @Test
    void averageExcludeMinMaxForSecondArray() {
        var solution = new Solution();
        int[] salary = {1000,2000,3000};
        assertEquals(2000, solution.averageExcludeMinMax(salary));
    }
}