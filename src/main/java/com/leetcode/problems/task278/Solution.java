package com.leetcode.problems.task278;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {


    public int firstBadVersion(int n, int bad) {
        int left = 0;
        int right = n;
        int mid = (left + right) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid, bad)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (isBadVersion(mid, bad))
            return mid;
        else
            return mid + 1;
    }
}