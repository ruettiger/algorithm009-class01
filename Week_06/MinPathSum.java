package com.rudy;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] min = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    min[i][j] = grid[i][j];
                } else if (i == 0) {
                    min[i][j] = min[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    min[i][j] = min[i - 1][j] + grid[i][j];
                } else {
                    min[i][j] = Math.min(min[i - 1][j], min[i][j - 1]) + grid[i][j];
                }
            }
        }
        return min[m - 1][n - 1];
    }
}
