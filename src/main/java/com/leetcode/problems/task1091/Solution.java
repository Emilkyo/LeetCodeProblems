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

    private static final int[][] DIRECTIONS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        // Check if the starting or ending cell is blocked
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;

        // Perform breadth-first search
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // Starting cell: (0, 0)
        grid[0][0] = 1; // Mark the starting cell as visited

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            int pathLength = cell[2];

            if (row == n - 1 && col == n - 1)
                return pathLength;

            // Explore all 8 directions
            for (int[] direction : DIRECTIONS) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                    queue.offer(new int[]{newRow, newCol, pathLength + 1});
                    grid[newRow][newCol] = 1; // Mark the cell as visited
                }
            }
        }
        return -1; // No clear path found
    }
}
