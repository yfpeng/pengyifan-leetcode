package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard
 * such that no two queens attack each other.
 * <p>
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * <p>
 * Each solution contains a distinct board configuration of the n-queens'
 * placement, where 'Q' and '.' both indicate a queen and an empty space
 * respectively.
 * <p>
 * For example,
 * <p>
 * There exist two distinct solutions to the 4-queens puzzle:
 * 
 * <pre>
 * [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 * 
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 */
public class NQueens {

  public List<String[]> solveNQueens(int n) {
    if (n <= 0) {
      return Collections.emptyList();
    }
    List<String[]> solutions = new ArrayList<String[]>();
    int[] queens = new int[n];
    Arrays.fill(queens, -1);

    solveNQueensHelper(queens, 0, solutions);

    return solutions;
  }

  private void solveNQueensHelper(int[] queens, int currentRow,
      List<String[]> solutions) {
    if (currentRow == queens.length) {
      getSolution(queens, solutions);
      return;
    }
    for (int j = 0; j < queens.length; j++) {
      queens[currentRow] = j;
      if (isValid(queens, currentRow)) {
        solveNQueensHelper(queens, currentRow + 1, solutions);
      }
    }
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

  private void getSolution(int[] queens, List<String[]> solutions) {
    String[] board = new String[queens.length];
    for (int i = 0; i < queens.length; i++) {
      board[i] = "";
      for (int j = 0; j < queens.length; j++) {
        if (j == queens[i]) {
          board[i] += "Q";
        } else {
          board[i] += ".";
        }
      }
    }
    solutions.add(board);
  }
}
