package com.pengyifan.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a 2D board containing 'X' and 'O', capture all regions surrounded by
 * 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded
 * region.
 * <p>
 * For example,
 * 
 * <pre>
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * </pre>
 * 
 * After running your function, the board should be:
 * 
 * <pre>
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * </pre>
 */
public class SurroundedRegions {

  public void solve(char[][] board) {
    if (board == null || board.length == 0 || board[0].length == 0) {
      return;
    }

    Queue<Pair> queue = new LinkedList<Pair>();
    // top
    for (int i = 0; i < board[0].length; i++) {
      if (board[0][i] == 'O') {
        queue.offer(new Pair(0, i));
      }
    }
    // bottom
    for (int i = 0; i < board[board.length - 1].length; i++) {
      if (board[board.length - 1][i] == 'O') {
        queue.offer(new Pair(board.length - 1, i));
      }
    }
    // left
    for (int i = 1; i < board.length - 1; i++) {
      if (board[i][0] == 'O') {
        queue.offer(new Pair(i, 0));
      }
    }
    // right
    for (int i = 1; i < board.length - 1; i++) {
      if (board[i][board[i].length - 1] == 'O') {
        queue.offer(new Pair(i, board[i].length - 1));
      }
    }
    while (!queue.isEmpty()) {
      Pair p = queue.poll();
      board[p.x][p.y] = 'L'; // live
      // four directions
      // up
      if (p.x > 0 && board[p.x - 1][p.y] == 'O') {
        board[p.x - 1][p.y] = 'L';
        queue.offer(new Pair(p.x - 1, p.y));
      }
      // down
      if (p.x < board.length - 1 && board[p.x + 1][p.y] == 'O') {
        board[p.x + 1][p.y] = 'L';
        queue.offer(new Pair(p.x + 1, p.y));
      }
      // left
      if (p.y > 0 && board[p.x][p.y - 1] == 'O') {
        board[p.x][p.y - 1] = 'L';
        queue.offer(new Pair(p.x, p.y - 1));
      }
      // right
      if (p.y < board[p.x].length - 1 && board[p.x][p.y + 1] == 'O') {
        board[p.x][p.y + 1] = 'L';
        queue.offer(new Pair(p.x, p.y + 1));
      }
    }
    // change
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'L') {
          board[i][j] = 'O';
        } else if (board[i][j] == 'O') {
          board[i][j] = 'X';
        }
      }
    }
  }

  private class Pair {

    int x;
    int y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
