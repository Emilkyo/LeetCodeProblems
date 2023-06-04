package com.leetcode.problems.task547;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int result = 0;
        int length = isConnected.length;
        boolean[] visited = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                result++;
                dfs(i, isConnected, visited, length);
            }
        }
        return result;
    }

    public void dfs(int node, int[][] isConnected, boolean[] visited, int n) {
        visited[node] = true;
        for (int i = 0; i < n; i++) {
            if (isConnected[node][i] == 1 && !visited[i]) {
                dfs(i, isConnected, visited, n);
            }
        }
    }
}
