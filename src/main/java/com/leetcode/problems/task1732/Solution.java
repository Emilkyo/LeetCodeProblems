package com.leetcode.problems.task1732;

public class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int track = 0;
        for (int j : gain) {
            track += j;
            max = Math.max(max, track);
        }
        return max;
    }

}
