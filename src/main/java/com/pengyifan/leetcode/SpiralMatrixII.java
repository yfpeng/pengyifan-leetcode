package com.pengyifan.leetcode;

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to
 * n2 in spiral order.
 * <p>
 * For example,
 * <p>
 * Given n = 3,
 * <p>
 * You should return the following matrix:
 * 
 * <pre>
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */
public class SpiralMatrixII {

  public int[][] generateMatrix(int n) {
    if (n == 0) {
      return new int[0][0];
    }
    int[][] board = new int[n][n];
    int num = 1;

    for (int layer = 0; layer <= (n - 1) / 2; layer++) {
      if (n - layer - 1 == layer) {
        board[layer][layer] = num;
      } else {
        // top
        for (int i = layer; i < n - layer - 1; i++) {
          board[layer][i] = num;
          num++;
        }
        // right
        for (int i = layer; i < n - layer - 1; i++) {
          board[i][n - layer - 1] = num;
          num++;
        }
        // btm
        for (int i = n - layer - 1; i > layer; i--) {
          board[n - layer - 1][i] = num;
          num++;
        }
        // right
        for (int i = n - layer - 1; i > layer; i--) {
          board[i][layer] = num;
          num++;
        }
      }
    }
    return board;
  }
}
