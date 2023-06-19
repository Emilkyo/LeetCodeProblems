package com.leetcode.problems.task1071;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void gcd140And96IsEquals4() {
        var testGCD = new Solution();
        assertEquals(4, testGCD.gcd(140, 96));
    }

    @Test
    void gcd24And18IsEquals6() {
        var testGCD = new Solution();
        assertEquals(6, testGCD.gcd(18, 24));
    }

    @Test
    void ABCABC_GCD_ABC_IsEqualsABC() {
        var example = new Solution();
        assertEquals("ABC", example.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    void ABABAB_GCD_ABAB_IsEqualsAB() {
        var example = new Solution();
        assertEquals("AB", example.gcdOfStrings("ABABAB", "AB"));
    }

    @Test
    void LEET_GCD_CODE_IsEqualsNull() {
        var example = new Solution();
        assertEquals("", example.gcdOfStrings("LEET", "CODE"));
    }
}