package com.leetcode.problems.task977;


import java.util.Arrays;

public class Test {
    private int[] input;
    private int[] expected;

    public void testSolution() {
        input = new int[]{-4, -1, 0, 3, 10};
        expected = new int[]{0, 1, 9, 16, 100};
        System.out.println("\tTest 1:");
        check();
        input = new int[]{-7, -3, 2, 3, 11};
        expected = new int[]{4, 9, 9, 49, 121};
        System.out.println("\tTest 2:");
        check();

    }

    private void check() {
        Solution solution = new Solution();
        System.out.println("input: " + Arrays.toString(input));
        solution.sortedSquares(input);
        System.out.println("result: " + Arrays.toString(input));
        System.out.println("expected: " + Arrays.toString(expected));

        boolean res = true;
        for (int i = 0; i < input.length; i++) {
            res = expected[i] == input[i];
        }
        System.out.println(res ? "Test passed" : "Test failed\n");
    }
}
