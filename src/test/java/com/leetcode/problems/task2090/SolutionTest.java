package com.leetcode.problems.task2090;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void getAverages() {
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int[] result = {-1, -1, -1, 5, 4, 4, -1, -1, -1};
        var solution = new Solution();
        assertArrayEquals(result, solution.getAverages(nums, 3));
    }
}