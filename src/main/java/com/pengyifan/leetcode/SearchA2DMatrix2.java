package com.pengyifan.leetcode;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the
 * following properties:
 * <p>
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * <p>
 * For example,
 * <p>
 * Consider the following matrix:
 * <pre>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * </pre>
 * Given target = 5, return true.
 * <p>
 * Given target = 20, return false.
 */
public class SearchA2DMatrix2 {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null) {
      return false;
    }
    return searchMatrixHelper(matrix, target, 0, matrix[0].length - 1);
  }

  private boolean searchMatrixHelper(int[][] matrix, int target, int row, int col) {
    if (row == matrix.length) {
      return false;
    }
    if (col < 0) {
      return false;
    }
    if (matrix[row][col] == target) {
      return true;
    }
    if (matrix[row][col] > target) {
      return searchMatrixHelper(matrix, target, row, col - 1);
    }
    return searchMatrixHelper(matrix, target, row + 1, col);
  }
}
