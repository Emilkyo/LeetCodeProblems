package com.leetcode.problems.task1491;

//  https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class Solution {
    Solution() {

    }

    public double averageExcludeMinMax(int[] salary) {
        int maxV = salary[0];
        int minV = salary[0];
        double sum = 0;
        for (int j : salary) {
            if (maxV < j) maxV = j;
            if (minV > j) minV = j;
            sum += j;
        }
        sum = sum - maxV - minV;
        return sum / (salary.length - 2);
    }
}
