package com.leetcode.problems.task1768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void abcPlusPqrIsEqualApbqcr() {
        var solution = new Solution();
        assertArrayEquals("apbqcr".toCharArray(), solution.mergeAlternately("abc", "pqr").toCharArray());
    }

    @Test
    void abPlusPqrsIsEqualApbqrs() {
        var solution = new Solution();
        assertArrayEquals("apbqrs".toCharArray(), solution.mergeAlternately("ab", "pqrs").toCharArray());
    }

    @Test
    void abcdPlusPqIsEqualApbqcd() {
        var solution = new Solution();
        assertArrayEquals("apbqcd".toCharArray(), solution.mergeAlternately("abcd", "pq").toCharArray());
    }
}