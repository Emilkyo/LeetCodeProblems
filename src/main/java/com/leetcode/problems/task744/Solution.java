package com.leetcode.problems.task744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int length = letters.length;
        int right = length - 1;
        if (target < letters[left] || target > letters[right])
            return letters[left];

        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (letters[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.gc();
        return left == length ? letters[0] : letters[left];
    }
}
