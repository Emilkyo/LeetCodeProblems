package com.leetcode.problems.util;

import java.util.Arrays;

public class PrintHandler {
    public PrintHandler(int[] result, int[] expected) {
        System.out.println("result: " + Arrays.toString(result));
        System.out.println("expected: " + Arrays.toString(expected));
        boolean res = true;
        for (int a = 0; a < result.length; a++) {
            res = (expected[a] == result[a]);
        }
        System.out.println(res ? "\t\tTest passed" : "\tTest failed\n");
    }
}
