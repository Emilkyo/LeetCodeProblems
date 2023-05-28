package com.leetcode.problems.main.task35;

// https://leetcode.com/problems/search-insert-position/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int index = left + (right - left) / 2;
            if (target == nums[index]) return index;
            else if (nums[index] > target)
                right = index - 1;
            else
                left = index + 1;
        }
        return left;
    }
}
