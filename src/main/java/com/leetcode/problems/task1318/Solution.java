package com.leetcode.problems.task1318;

public class Solution {
    public int minFlips(int a, int b, int c) {
        int answer = 0;
        while (a != 0 | b != 0 | c != 0) {
            // #TODO: write the logic
            // if(c )
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return answer;
    }
}
