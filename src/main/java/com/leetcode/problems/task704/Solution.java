package com.leetcode.problems.task704;

//https://leetcode.com/problems/binary-search/description/
//  TODO: create description and tests

public class Solution {
    public int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (target == nums[middleIndex]) {
                return middleIndex;
            } else {
                if (target > nums[middleIndex])
                    leftIndex = middleIndex + 1;
                else
                    rightIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}