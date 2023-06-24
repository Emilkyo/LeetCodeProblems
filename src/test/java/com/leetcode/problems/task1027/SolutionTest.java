package com.leetcode.problems.task1027;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void example1() {
        int[] nums = {3, 6, 9, 12};
        var task = new Solution();
        assertEquals(4, task.longestArithSeqLength(nums));
    }

    @Test
    void example2() {
        int[] nums = {9, 4, 7, 2, 10};
        var task = new Solution();
        assertEquals(3, task.longestArithSeqLength(nums));
    }

    @Test
    void example3() {
        int[] nums = {20, 1, 15, 3, 10, 5, 8};
        var task = new Solution();
        assertEquals(4, task.longestArithSeqLength(nums));
    }

    @Test
    void example4() {
        int[] nums = {24, 13, 1, 100, 0, 94, 3, 0, 3};
        var task = new Solution();
        assertEquals(2, task.longestArithSeqLength(nums));
    }

    @Test
    void example5() {
        int[] nums = {0, 8, 45, 88, 48, 68, 28, 55, 17, 24};
        var task = new Solution();
        assertEquals(2, task.longestArithSeqLength(nums));
    }
}