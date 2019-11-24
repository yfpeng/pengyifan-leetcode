package com.pengyifan.leetcode;

public class DungeonGame {

  public int calculateMinimumHP(int[][] dungeon) {
    if (dungeon == null || dungeon.length == 0) {
      return 0;
    }
    int row = dungeon.length;
    int col = dungeon[0].length;
    int[][] dp = new int[row][col];
    for (int i = row - 1; i >= 0; i--) {
      for (int j = col - 1; j >= 0; j--) {
        if (i == row - 1 && j == col - 1) {
          dp[i][j] = dungeon[i][j] >= 0 ? 1 : 1 - dungeon[i][j];
        } else {
          int minToNext = (i == row - 1) ? dp[i][j + 1] :
              ((j == col - 1) ? dp[i + 1][j] : Math.min(dp[i + 1][j], dp[i][j + 1]));
          dp[i][j] = dungeon[i][j] >= minToNext ? 1 : minToNext - dungeon[i][j];
        }
      }
    }
    return dp[0][0];
  }
}
