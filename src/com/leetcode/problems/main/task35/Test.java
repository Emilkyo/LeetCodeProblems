package com.leetcode.problems.main.task35;

import com.leetcode.problems.main.task35.Solution;

import java.util.Arrays;

public class Test {
    public static void testSolution() {
        int[] nums = {1, 3, 5, 6};
        int[] target = {5, 2, 7};
        int[] expected = {2, 1, 4};
        for (int i = 0; i < target.length; i++) {
            System.out.println("Test " + (i + 1));
            check(nums, target[i], expected[i]);
        }
    }

    private static void check(int[] nums, int target, int expected) {
        Solution solution = new Solution();
        int result = solution.searchInsert(nums, target);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("target: " + target);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected + "\n");
    }
}
