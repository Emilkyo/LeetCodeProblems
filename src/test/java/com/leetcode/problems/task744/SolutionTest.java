package com.leetcode.problems.task744;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void print() {
        char[] letters = new char[]{'a'};

        var solution = new Solution();
        var res = solution.nextGreatestLetter(letters, 'a');
        for (int i = res + 26; res < i; res++) {
            System.out.println("char = " + (int) res + " \t" + res);
            System.out.println("CAPSchar = " + ((int) res - 42) + " \t" + (char) (res - 42));
        }
    }

    @Test
    void FFFTest() {
        char[] letters = new char[]{'f', 'f', 'f'};
        var solution = new Solution();
        assertEquals('f', solution.nextGreatestLetter(letters, 'f'), "This message means that all is good");
    }

    @Test
    void CFJTestIsReturnF() {
        char[] letters = new char[]{'c', 'f', 'j'};
        var solution = new Solution();
        assertEquals('f', solution.nextGreatestLetter(letters, 'c'));
    }
}