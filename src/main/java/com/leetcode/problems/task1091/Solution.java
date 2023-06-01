package com.leetcode.problems.task1091;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String printArray(int[][] grid) {
        StringBuilder array = new StringBuilder();
        for (int[] row : grid) {
            for (int cell : row) {
                array.append(cell).append(" ");
            }
            array.append("\n");
        }
        return array.toString();
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        int steps = 0;
        for (int[] row : grid) {
            for (int cell : row) {

            }
        }
        return steps;
    }
    private int bfs(int[][] matrix, int x, int y) {

        // Queue for bfs traversal
        Queue<int[]> q = new LinkedList<>();

        int n = matrix.length;
        int m = matrix[0].length;
        q.offer(new int[] { x, y, 0 });

        int ans = -1;
        int[][] visited = new int[n][m];

        while (!q.isEmpty()) {
            int[] v = q.poll();
            int i = v[0], j = v[1], moves = v[2];

            if (i >= n || i < 0 || j >= m || j < 0) {
                // As soon as p reaches
                // out of the bounds stop
                // bfs calls
                ans = moves;
                break;
            } else {
                if (visited[i][j] == 1)
                    continue;
                visited[i][j] = 1;

                // Bfs calls in all
                // possible directions
                if (i + 1 >= n || matrix[i + 1][j] != 0)
                    q.offer(new int[] { i + 1, j, moves + 1 });

                if (i - 1 < 0 || matrix[i - 1][j] != 0)
                    q.offer(new int[] { i - 1, j, moves + 1 });

                if (j + 1 >= m || matrix[i][j + 1] != 0)
                    q.offer(new int[] { i, j + 1, moves + 1 });

                if (j - 1 < 0 || matrix[i][j - 1] != 0)
                    q.offer(new int[] { i, j - 1, moves + 1 });
            }
        }

        return ans;
    }

    public int minMoves(int[][] matrix, int x, int y) {
        int ans = bfs(matrix, x, y);
        return (ans >= 1e7) ? -1 : ans - 1;
    }
}
