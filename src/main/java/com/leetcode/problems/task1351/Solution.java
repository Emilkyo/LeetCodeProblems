package com.leetcode.problems.task1351;

public class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int value : row) {
                if (value < 0) count++;
            }
        }
        return count;

    }
}
