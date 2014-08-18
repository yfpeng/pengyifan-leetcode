package com.pengyifan.leetcode;

/**
 * Given a m x n grid filled with non-negative numbers, find a path from top
 * left to bottom right which minimizes the sum of all numbers along its path.
 */
public class MinimumPathSum {

  public int minPathSum(int[][] grid) {
    if (grid == null) {
      return 0;
    }
    int row = grid.length;
    int col = grid[row - 1].length;
    int[][] minVal = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (i == 0 && j == 0) {
          minVal[i][j] = grid[i][j];
        } else if (i == 0) {
          minVal[i][j] = minVal[i][j - 1] + grid[i][j];
        } else if (j == 0) {
          minVal[i][j] = minVal[i - 1][j] + grid[i][j];
        } else {
          minVal[i][j] = Math.min(minVal[i - 1][j], minVal[i][j - 1])
              + grid[i][j];
        }
      }
    }
    return minVal[row - 1][col - 1];
  }
}
