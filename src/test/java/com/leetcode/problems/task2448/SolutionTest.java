package com.leetcode.problems.task2448;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void name() {
        int[] nums = {1, 3, 5, 2}, cost = {2, 3, 1, 14};
        var solution = new Solution();
        assertEquals(8, solution.minCost(nums, cost));
    }

    @Test
    void sortArrays() {
        int[] nums = {1, 3, 5, 2}, cost = {2, 3, 1, 14};
        var solution = new Solution();
        solution.minCost(nums, cost);

//        int[] sortedNums = {1, 2, 3, 5};
//        System.out.println("nums: " + Arrays.toString(solution.getN()));
//        assertArrayEquals(sortedNums, solution.getN());
//
//        int[] sortedCost = {2, 14, 3, 1};
//        System.out.println("cost: " + Arrays.toString(solution.getC()));
//        assertArrayEquals(sortedCost, solution.getC());
    }

    @Test
    void example() {
        int[] nums = {1, 3, 5, 2}, cost = {2, 3, 1, 14};
        var solution = new Solution();
        assertEquals(8, solution.minCost(nums, cost));
    }
}