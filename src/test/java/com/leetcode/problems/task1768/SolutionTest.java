package com.leetcode.problems.task1768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void abcPlusPqrIsEqualApbqcr() {
        var solution = new Solution();
        assertArrayEquals("apbqcr".toCharArray(), solution.mergeAlternately("abc","pqr").toCharArray());
    }
}