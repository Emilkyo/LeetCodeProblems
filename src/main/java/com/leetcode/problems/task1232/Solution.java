package com.leetcode.problems.task1232;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] point1 = coordinates[0];
        int[] point2 = coordinates[1];

        int deltaX = point2[0] - point1[0];
        int deltaY = point2[1] - point1[1];

        for (int i = 2; i < coordinates.length; i++) {
            int[] currentPoint = coordinates[i];

            // Calculate the slope between the current point and the first point
            int currentDeltaX = currentPoint[0] - point1[0];
            int currentDeltaY = currentPoint[1] - point1[1];
            if (deltaX * currentDeltaY != deltaY * currentDeltaX)
                return false;
        }
        return true;
    }
}