package com.leetcode.problems.task1071;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    public int gcd(int x, int y) {
        if (x % y == 0)
            return y;
        else
            //noinspection SuspiciousNameCombination
            return gcd(y, x % y);
    }
}
