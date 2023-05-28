package com.leetcode.problems.main.task1833;

// https://leetcode.com/problems/maximum-ice-cream-bars/

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
