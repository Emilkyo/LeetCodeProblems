package com.leetcode.problems.task189;

//https://leetcode.com/problems/rotate-array/

public class Solution {
    private final int[] nums;
    private final int length;

    public Solution(int[] nums, int k) {
        this.nums = nums;
        this.length = nums.length;
        rotate(nums, k);
    }

    public int[] result() {
        return nums;
    }

    //Rotating step by step
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        int index = length - k;
        int[] rotated = new int[length];
        int i;
        //first half array
        for (i = 0; index < length; i++, index++) {
            rotated[i] = nums[index];
        }

        //second half array
        index = length - k;
        for (int j = 0; j < index; j++, i++) {
            rotated[i] = nums[j];
        }

        for (int j = 0; j < length; j++) {
            nums[j] = rotated[j];
        }
    }
}
