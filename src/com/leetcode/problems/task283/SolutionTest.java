package com.leetcode.problems.task283;

import com.leetcode.problems.util.printHandler;

import java.util.Arrays;

public class SolutionTest {
    private int[][] array;
    private int[][] expected;

    public SolutionTest() {
        array =    new int[][]{{0, 1, 0, 3, 12}, {0}, {0, 0}, {-1}, {1, 2, 3, 0, 5, 6, 7}, {-1, -100, 3, 0}};
        expected = new int[][]{{1, 3, 12, 0, 0}, {0}, {0, 0}, {-1}, {1, 2, 3, 5, 6, 7, 0}, {-1, -100, 3, 0}};
    }

    public void check() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\n\t\tTest case %d \n", i + 1);
            System.out.println("input: " + Arrays.toString(array[i]));
            Solution solution = new Solution(array[i]);
            int[] result = solution.result();
            new printHandler(result,expected[i]);

        }
    }
}
