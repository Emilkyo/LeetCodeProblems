package com.leetcode.problems.task283;

//https://leetcode.com/problems/move-zeroes/
public class Solution {
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        boolean isZero = true;
        int[] indexes;
        int zeroAmount = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                zeroAmount++;
            }
            indexes = new int[zeroAmount];
        }

    }
    public int[] result(){
        return nums;
    }
}
