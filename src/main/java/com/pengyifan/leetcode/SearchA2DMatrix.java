package com.pengyifan.leetcode;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right. The first integer of
 * each row is greater than the last integer of the previous row. For example,
 * <p>
 * Consider the following matrix:
 * 
 * <pre>
 * [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * </pre>
 * 
 * Given target = 3, return true.
 */
public class SearchA2DMatrix {

  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null) {
      return false;
    }
    return searchMatrixHelper(
        matrix,
        0,
        matrix.length * matrix[0].length,
        target);
  }

  private boolean searchMatrixHelper(int[][] matrix, int start, int end,
      int target) {
    if (start >= end) {
      return false;
    }
    int mid = (start + end) / 2;
    int row = mid / matrix[0].length;
    int column = mid % matrix[0].length;
    if (matrix[row][column] == target) {
      return true;
    } else if (matrix[row][column] > target) {
      return searchMatrixHelper(matrix, start, mid, target);
    } else {
      return searchMatrixHelper(matrix, mid + 1, end, target);
    }
  }
}
