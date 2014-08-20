package com.pengyifan.leetcode;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to
 * 0. Do it in place.
 * <p>
 * click to show follow up. Follow up:
 * <p>
 * Did you use extra space?
 * <p>
 * A straight forward solution using O(mn) space is probably a bad idea.
 * <p>
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * <p>
 * Could you devise a constant space solution?
 */
public class SetMatrixZeroes {

  /**
   * O(m + n) space
   */
  public void setZeroes(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }

    boolean row[] = new boolean[matrix.length];
    boolean col[] = new boolean[matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          row[i] = true;
          col[j] = true;
        }
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (row[i] || col[j]) {
          matrix[i][j] = 0;
        }
      }
    }
  }

  /**
   * a constant space solution
   */
  public void setZeroes2(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }

    boolean rowHasZero = false;
    boolean colHasZero = false;
    // check first row
    for (int i = 0; i < matrix[0].length; i++) {
      if (matrix[0][i] == 0) {
        rowHasZero = true;
      }
    }
    // check first column
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        colHasZero = true;
      }
    }

    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if (rowHasZero) {
      for (int i = 0; i < matrix[0].length; i++) {
        matrix[0][i] = 0;
      }
    }
    if (colHasZero) {
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }
  }
}
