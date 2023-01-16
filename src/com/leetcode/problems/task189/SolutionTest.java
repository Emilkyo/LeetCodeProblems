package com.leetcode.problems.task189;

import java.util.Arrays;

import com.leetcode.problems.util.PrintHandler;

public class SolutionTest {
    private int[][] array;

    private final int[][] expected;
    private int[] k;

    public SolutionTest() {
        array = new int[][]{{1, 2, 3, 4}, {1, 2}, {-1}, {1, 2, 3, 4, 5, 6, 7}, {-1, -100, 3, 99}};
        k = new int[]{4, 3, 2, 3, 2};
        expected = new int[][]{{1, 2, 3, 4}, {2, 1}, {-1}, {5, 6, 7, 1, 2, 3, 4}, {3, 99, -1, -100}};
    }

    public void check() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\n\t\tTest case %d \n", i + 1);
            System.out.println("input: " + Arrays.toString(array[i]));
            System.out.printf("k: %d \n", k[i]);
            Solution solution = new Solution(array[i], k[i]);
            int[] result = solution.result();
            new PrintHandler(result,expected[i]);
        }
    }
}
