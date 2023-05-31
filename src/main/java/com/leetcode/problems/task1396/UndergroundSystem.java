package com.leetcode.problems.task1396;

import java.util.HashMap;

public class UndergroundSystem {
    private final HashMap<Integer, Pair> checkInHashMap;       //save the check-in time for a customer
    private final HashMap<String, Pair> travels;        //update the total time between two stations

    public UndergroundSystem() {
        checkInHashMap = new HashMap<>();
        travels = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInHashMap.put(id, new Pair(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        String travel = checkInHashMap.get(id).stationName + "," + stationName;
        int travelTime = t - checkInHashMap.get(id).time;
        checkInHashMap.remove(id);

        if (travels.containsKey(travel)) {
            Pair travelInfo = travels.get(travel);
            travelInfo.distance += travelTime;
            travelInfo.routes++;
        } else {
            travels.put(travel, new Pair(travelTime, 1));
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String travel = startStation + "," + endStation;
        Pair travelInfo = travels.get(travel);
        return (double) travelInfo.distance / travelInfo.routes;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
