package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class SurroundedRegionsTest {
  
  SurroundedRegions s = new SurroundedRegions();

  @Test
  public void testSolve() {
    char[][] board = new char[][] {
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'O', 'X'},
        {'X', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'X'},
    };
    char[][] expected = new char[][] {
        {'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'X', 'X'},
    };
    s.solve(board);
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        assertEquals(expected[i][j], board[i][j]);
      }
    }
  }

}
