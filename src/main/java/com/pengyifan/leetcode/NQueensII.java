package com.pengyifan.leetcode;

import java.util.Arrays;

/**
 * Now, instead outputting board configurations, return the total number of
 * distinct solutions.
 */
public class NQueensII {

  public int totalNQueens(int n) {
    if (n <= 0) {
      return 0;
    }
    int[] queens = new int[n];
    Arrays.fill(queens, -1);
    return solveNQueensHelper(queens, 0);
  }

  private int solveNQueensHelper(int[] queens, int currentRow) {
    if (currentRow == queens.length) {
      return 1;
    }
    int result = 0;
    for (int j = 0; j < queens.length; j++) {
      queens[currentRow] = j;
      if (isValid(queens, currentRow)) {
        result += solveNQueensHelper(queens, currentRow + 1);
      }
    }
    return result;
  }

  private boolean isValid(int[] queens, int currentRow) {
    for (int i = 0; i < currentRow; i++) {
      // same column
      if (queens[i] == queens[currentRow]) {
        return false;
      }
      // diagonal
      if (Math.abs(queens[i] - queens[currentRow]) == currentRow - i) {
        return false;
      }
    }
    return true;
  }
}
