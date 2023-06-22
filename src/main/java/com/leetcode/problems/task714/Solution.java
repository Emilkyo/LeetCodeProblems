package com.leetcode.problems.task714;

public class Solution {
    public int maxProfit(int[] prices, int fee) {
        int free = 0;
        int hold = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            int tmp = hold;
            hold = Math.max(hold, free - prices[i]);
            free = Math.max(free, tmp + prices[i] - fee);
        }

        System.gc();
        return free;
    }
}
