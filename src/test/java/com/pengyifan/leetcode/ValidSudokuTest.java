package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidSudokuTest {

  private ValidSudoku t = new ValidSudoku();

  @Test
  public void testIsValidSudoku() throws Exception {
    String[] s = new String[]{".87654321", "2........", "3........", "4........", "5........",
        "6........", "7........", "8........", "9........"};
    char[][] board = getBoard(s);
    assertTrue(t.isValidSudoku(board));
  }

  private char[][] getBoard(String[] s) {
    char[][] board = new char[9][9];
    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < s[i].length(); j++) {
        board[i][j] = s[i].charAt(j);
      }
    }
    return board;
  }
}