package com.leetcode.problems.task2090;

import java.util.Arrays;

public class Solution {
    public int[] getAverages(int[] nums, int k) {
        int avg = -1, n = nums.length;
        int[] averages = new int[n];

        if (k < 1) {
            return nums;
        }

        Arrays.fill(averages, -1);
        if (2 * k + 1 > n) {
            return averages;
        }

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = k; i < (n - k); ++i) {
            int leftBound = i - k, rightBound = i + k;
            long subArraySum = prefix[rightBound + 1] - prefix[leftBound];
            int average = (int) (subArraySum / (2 * k + 1));
            averages[i] = average;
        }
        return averages;
    }
}