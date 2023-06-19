package com.leetcode.problems.task2352;

public class Solution {
    // TODO: add description

    public int equalPairs(int[][] grid) {
        int pairs = 0;
        int n = grid.length;
        for (int[] rows : grid) {
            for (int column = 0; column < n; column++) {
                boolean isEqual = true;
                for (int i = 0; i < n; i++) {
                    if (rows[i] != grid[i][column]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) pairs++;
            }
        }
        System.gc();
        return pairs;
    }
}