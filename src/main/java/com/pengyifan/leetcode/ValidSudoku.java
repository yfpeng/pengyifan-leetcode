package com.pengyifan.leetcode;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * <p>
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * <p>
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need
 * to be validated.
 * </p>
 */
public class ValidSudoku {

  private final static int SIZE = 9;

  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < SIZE; i++) {
      if (!validRow(board, i)) {
        return false;
      }
      if (!validCol(board, i)) {
        return false;
      }
    }
    for (int i = 0; i < SIZE; i += 3) {
      for (int j = 0; j < SIZE; j += 3) {
        if (!validSquare(board, i, j)) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean validSquare(char[][] board, int row, int col) {
    boolean[] b = new boolean[SIZE];
    for (int i = row; i < row + 3; i++) {
      for (int j = col; j < col + 3; j++) {
        if (board[i][j] == '.') {
          ;
        } else if (b[board[i][j] - '1']) {
          return false;
        } else {
          b[board[i][j] - '1'] = true;
        }
      }
    }
    return true;
  }

  private boolean validRow(char[][] board, int row) {
    boolean[] b = new boolean[SIZE];
    for (int i = 0; i < SIZE; i++) {
      if (board[row][i] == '.') {
        ;
      } else if (b[board[row][i] - '1']) {
        return false;
      } else {
        b[board[row][i] - '1'] = true;
      }
    }
    return true;
  }

  private boolean validCol(char[][] board, int col) {
    boolean[] b = new boolean[SIZE];
    for (int i = 0; i < SIZE; i++) {
      if (board[i][col] == '.') {
        ;
      } else if (b[board[i][col] - '1']) {
        return false;
      } else {
        b[board[i][col] - '1'] = true;
      }
    }
    return true;
  }
}
