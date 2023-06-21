package com.leetcode.problems.task2448;

import java.util.Arrays;

public class Solution {

    private int[] n;
    private int[] c;
    private int size;

    public long minCost(int[] nums, int[] cost) {
        sortArrays(nums, cost);

        // Get the prefix sum array of the costs.
        long[] prefixCost = new long[size];
        prefixCost[0] = c[0];
        for (int i = 1; i < size; ++i)
            prefixCost[i] = c[i] + prefixCost[i - 1];

        // Then we try every integer nums[i] and make every element equals nums[i],
        // Start with nums[0]
        long totalCost = 0L;
        for (int i = 1; i < size; ++i)
            totalCost += (long) c[i] * (n[i] - n[0]);
        long answer = totalCost;

        // Then we try nums[1], nums[2] and so on. The cost difference is made by the change of
        // two parts: 1. prefix sum of costs. 2. suffix sum of costs.
        // During the iteration, record the minimum cost we have met.
        for (int i = 1; i < size; ++i) {
            int gap = n[i] - n[i - 1];
            totalCost += prefixCost[i - 1] * gap;
            totalCost -= (prefixCost[size - 1] - prefixCost[i - 1]) * gap;
            answer = Math.min(answer, totalCost);
        }
        return answer;
    }

    public void sortArrays(int[] nums, int[] costs) {
        size = nums.length;
        n = new int[size];
        c = new int[size];

        Integer[] indexes = new Integer[size];
        for (int i = 0; i < size; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, (a, b) -> nums[a] - nums[b]);

        for (int i = 0; i < size; i++) {
            n[i] = nums[indexes[i]];
            c[i] = costs[indexes[i]];
        }
    }

}

