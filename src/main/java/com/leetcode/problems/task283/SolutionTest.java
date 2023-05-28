package com.leetcode.problems.task283;

import com.leetcode.problems.util.PrintHandler;

import java.util.Arrays;

public class SolutionTest {
    private final int[][] array;
    private final int[][] expected;

    public SolutionTest() {
        array = new int[][]{{0, 1, 0, 3, 12}, {0}, {0, 0}, {-1}, {1, 2, 3, 0, 5, 6, 7}, {-1, -100, 3, 0}};
        expected = new int[][]{{1, 3, 12, 0, 0}, {0}, {0, 0}, {-1}, {1, 2, 3, 5, 6, 7, 0}, {-1, -100, 3, 0}};
    }

    public void check() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\n\t\tTest case %d \n", i + 1);
            System.out.println("input: " + Arrays.toString(array[i]));
            Solution solution = new Solution(array[i]);
            solution.moveZeroes(array[i]);
            int[] result = solution.result();
            new PrintHandler(result, expected[i]);

        }
    }
}
