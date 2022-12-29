package com.leetcode.problems.task278;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Task278 extends VersionControl {

    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        if (!isBadVersion(n))
            return n + 1;
        int mid = right / 2;

        while (left <= right) {
            if (isBadVersion(mid)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = right / 2;
        }
        return mid + 1;
    }
}