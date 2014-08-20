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

  public void setZeroes(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }

    int row[] = new int[matrix.length];
    int col[] = new int[matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          row[i] = -1;
          col[j] = -1;
        }
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (row[i] == -1 || col[j] == -1) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
