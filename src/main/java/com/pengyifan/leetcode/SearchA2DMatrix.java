package com.pengyifan.leetcode;

public class SearchA2DMatrix {

  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null) {
      return false;
    }
    return searchMatrixHelper(matrix, 0, matrix.length * matrix[0].length, target);
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
