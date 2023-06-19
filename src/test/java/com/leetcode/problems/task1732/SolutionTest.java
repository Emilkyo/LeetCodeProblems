package com.leetcode.problems.task1732;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void exampleEqualsZero() {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        var solution = new Solution();
        assertEquals(0, solution.largestAltitude(gain));

    }

    @Test
    void exampleEqualsOne() {
        int[] gain = {-5, 1, 5, 0, -7};
        var solution = new Solution();
        assertEquals(1, solution.largestAltitude(gain));
    }
}