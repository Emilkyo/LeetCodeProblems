package com.leetcode.problems.task714;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maxProfit() {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        var solution = new Solution();
        assertEquals(8, solution.maxProfit(prices, fee));
    }
}