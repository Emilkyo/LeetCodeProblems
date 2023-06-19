package com.leetcode.problems.task228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int l = nums.length;
        if (l == 0)
            return new ArrayList<>();

        List<String> ranges = new ArrayList<>();
        int start = nums[0];
        int end = nums[nums.length - 1];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                end = nums[i - 1];
            }
            ranges.add(start + "->" + end);
            start = nums[i];
        }

        // Handle the last range
        if (start == nums[nums.length - 1]) {
            ranges.add(Integer.toString(start));
        } else {
            ranges.add(start + "->" + nums[nums.length - 1]);
        }

        return ranges;
    }
}
