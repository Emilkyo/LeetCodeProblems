package com.leetcode.problems.task1396;

public class Pair {
    public String stationName;
    int time;
    int distance;
    int routes;

    Pair(String stationName, int time) {
        this.stationName = stationName;
        this.time = time;
    }

    Pair(int distance) {
        this.distance = distance;
        this.routes = 1;
    }
}
