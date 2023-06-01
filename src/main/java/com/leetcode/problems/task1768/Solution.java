package com.leetcode.problems.task1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0, k = 0, l = 0; i < word1.length() + word2.length(); i++, k++, l++) {
            if (k < word1.length())
                result.append(word1.charAt(k));
            if (l < word2.length())
                result.append(word2.charAt(l));
        }
        return result.toString();
    }
}
