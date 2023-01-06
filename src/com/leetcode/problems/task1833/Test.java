package com.leetcode.problems.task1833;

import java.util.Arrays;

public class Test {
    private final int[][] costs;
    private final int[] coins;
    private final int[] expected;

    public Test() {
        costs = new int[][]{{1, 3, 2, 4, 1}, {10, 6, 8, 7, 7, 8}, {1, 6, 3, 1, 2, 5}};
        coins = new int[]{7, 5, 20};
        expected = new int[]{4, 0, 6};
    }

    public void check() {
        Solution solution = new Solution();
        for (int i = 0; i < costs.length; i++) {
            System.out.printf("Test case %d \n", i + 1);
            System.out.println("\tcosts: " + Arrays.toString(costs[i]));
            System.out.printf("\tcoins: %d \n", coins[i]);
            int result = solution.maxIceCream(costs[i], coins[i]);
            System.out.printf("\tresult: %d \n", result);
            System.out.printf("\texpected: %d \n", expected[i]);
            System.out.println(result == expected[i] ? "Test passed\n" : "Test failed\n");
        }
    }
}
