package com.leetcode.problems.task705;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {
    @Test
    void addTwoAndCheckAndRemoveAndCheck() {
        var set = new MyHashSet();
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1));
        set.add(3);
        assertTrue(set.contains(1));
        set.remove(2);
        assertFalse(set.contains(2));
    }
}