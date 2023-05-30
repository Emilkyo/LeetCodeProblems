package com.leetcode.problems.task1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0, k = 0; i < word1.length() && k < word2.length(); i++, k++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(k));
        }
        return String.valueOf(result);
    }
}
