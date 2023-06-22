package com.leetcode.problems.task1480;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void firstExample() {
        int[] nums = {1, 2, 3, 4};
        int[] result = {1, 3, 6, 10};
        var task = new Solution();
        assertArrayEquals(result, task.runningSum(nums));
    }
}