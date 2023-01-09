package com.leetcode.problems.task189;
public class NotSolution {
    private final int[] nums;

    public NotSolution(int[] nums, int k) {
        this.nums = nums;
        rotate(nums, k);
    }

    public int[] result() {

        return nums;
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;

        int index = length - k;
        int[] result = new int[length];
        if (k >= length) {       // 3 > 2
            k = length;
            for (int i = 0; i < length; i++, k--) {
                result[i] = nums[k - 1];
            }
        } else {
            int i = 0;
            while (index < length) {
                result[i] = nums[index];
                index++;
                i++;
            }
            index = length - k;
            for (int p = 0; p < index; p++, k++) {
                result[k] = nums[p];
            }
        }
        for (int i = 0; i < length; i++) {
            nums[i] = result[i];
        }
    }
}
