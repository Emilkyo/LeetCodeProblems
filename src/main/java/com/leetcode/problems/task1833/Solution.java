package com.leetcode.problems.task1833;

// https://leetcode.com/problems/maximum-ice-cream-bars/
// TODO: add description and rewrite tests

import java.util.Arrays;

public class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int result = 0;
        Arrays.sort(costs);
        for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                result++;
            } else break;
        }
        return result;
    }
}
