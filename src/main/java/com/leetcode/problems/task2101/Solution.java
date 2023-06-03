package com.leetcode.problems.task2101;

import java.util.*;

public class Solution {
    public int maximumDetonation(int[][] bombs) {
        if (bombs == null || bombs.length == 0) return 0;
        int answer = 0;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int n = bombs.length;

        // Build graph
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int xi = bombs[i][0], yi = bombs[i][1], ri = bombs[i][2];
                int xj = bombs[j][0], yj = bombs[j][1];

                // find distance
                long distanceSq = (long) (xj - xi) * (xj - xi) + (long) (yj - yi) * (yj - yi);
                if (distanceSq <= (long) ri * ri) {
                    graph.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int count = dfs(i, new HashSet<>(), graph);
            answer = answer > count ? answer : count;
        }

        return answer;
    }

    //DFS to get the number of nodes reachable from a given node cur
    private int dfs(int cur, Set<Integer> visited, Map<Integer, List<Integer>> graph) {
        visited.add(cur);
        int count = 1;
        for (int neib : graph.getOrDefault(cur, new ArrayList<>())) {
            if (!visited.contains(neib)) {
                count += dfs(neib, visited, graph);
            }
        }
        return count;
    }
}
