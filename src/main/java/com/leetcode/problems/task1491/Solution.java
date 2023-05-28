package com.leetcode.problems.task1491;

//  https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class Solution {
    Solution() {
        int[] salary = {4000, 3000, 1000, 2000};
        average(salary);
    }

    public double average(int[] salary) {
        int maxV = 0, minV = 0;
        double average = 0;
        for (int i = 0; i < salary.length; i++) {
            if (maxV < salary[i]) maxV = salary[i];
            if (minV > salary[i]) minV = salary[i];
            average += salary[i];
        }
        average = average - (maxV + minV);
        return average / (salary.length - 2);
    }
}
