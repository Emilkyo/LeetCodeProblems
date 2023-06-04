package com.leetcode.problems.task1376;

public class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int result = 0;
        if (n == 1) return result;

        for (int i = 0; i < n; i++) {
            if (i == headID) continue;
            int time = 0;
            int cur = i;
            while (cur != headID) {
                time += informTime[manager[cur]];
                cur = manager[cur];
            }
            result = Math.max(result, time);
        }
        return result;
    }
}
