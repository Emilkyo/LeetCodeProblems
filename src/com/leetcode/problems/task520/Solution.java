package com.leetcode.problems.task520;

//https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCh = 0;
        boolean result = false;
        int wLength = word.length();
        char firstChar = word.charAt(0);

        for (int i = 0; i < wLength; i++) {
            char tempChar = word.charAt(i);
            if (Character.isUpperCase(tempChar)) {
                upperCh++;
                result = true;
            } else {
                result = false;
            }
        }

        if (upperCh > 0)
            result = true;
        if (upperCh == 0)
            result = true;
        if ((upperCh < wLength) && (upperCh > 1))
            result = false;
        if ((upperCh == 1) && Character.isLowerCase(firstChar))
            result = false;


        return result;
    }
}
