package com.leetcode.problems.task1146;

import java.util.Map;

public class SnapshotArray {
    private final int[] nums;
    private final int[][] historyRecord;
    private Map<Integer, Integer> historyRecordMap;

    public SnapshotArray(int length) {
        nums = new int[length];
        historyRecord = new int[length][];
    }
//  TODO: Solve this problem

//    public void set(int index, int val) {
//        nums[index] = val;
//        //history_record[index] =
//        historyRecordMap<, val>
//
//    }
//
//    public int snap() {
//        return array.length - 1;
//    }
//
//    public int get(int index, int snap_id) {
//        return array[index]
//    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
