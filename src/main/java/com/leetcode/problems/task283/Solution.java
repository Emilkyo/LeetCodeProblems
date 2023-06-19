package com.leetcode.problems.task283;

//https://leetcode.com/problems/move-zeroes/
//  TODO: create description and tests

public class Solution {
    private final int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        if (length == 1) return;

        for (int i = length - 1; i > 0; i--) {
            if (nums[i] == 0) {
                for (int k = length - 1; k > i; k--) {
                    nums[i] = nums[i + 1];
                }
            }
        }
//        boolean isZero = true;
//        int[] indexes;
//        int zeroAmount = 0;
//        for (int i = 0; i < length; i++) {
//            if (nums[i] == 0) {
//                zeroAmount++;
//            }
//        }
//        indexes = new int[zeroAmount];
//
//        int k = 0;
//        for (int i = 0; i < length; i++) {
//            if (nums[i] == 0) {
//                indexes[k] = i;
//                k++;
//            }
//        }
//
//        for (int i = 0; i <  ; i++) {
//            int temp = nums[length - 1];
//            nums[length - 1] = indexes[k];
//            k++;
//        }

    }

    public int[] result() {
        return nums;
    }
}
