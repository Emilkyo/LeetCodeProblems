package com.leetcode.problems.task977;
// https://leetcode.com/problems/squares-of-a-sorted-array/
//  TODO: create description and rewrite tests


class Solution {
    public int[] sortedSquares(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                index = i;
                break;
            }
            index = i;
        }
        int[] negative = new int[index];
        int[] positive = new int[nums.length - index];
        for (int i = 0; i < index; i++) {
            int temp = index - 1 - i;
            negative[i] = nums[temp] * nums[temp];
        }

        for (int i = 0; i < positive.length; i++) {
            positive[i] = nums[index] * nums[index];
            index++;
        }
        int k = 0, n = 0, i = 0;
        while (k < negative.length && n < positive.length) {
            if (positive[n] > negative[k]) {
                nums[i] = negative[k];
                k++;
            } else {
                nums[i] = positive[n];
                n++;
            }
            i++;
        }
        if (k < negative.length) {
            while (i < nums.length) {
                nums[i] = negative[k];
                k++;
                i++;
            }
        }
        if (n < positive.length) {
            while (i < nums.length) {
                nums[i] = positive[n];
                n++;
                i++;
            }
        }
        return nums;
    }

}