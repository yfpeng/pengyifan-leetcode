package com.pengyifan.leetcode;

/**
 * You are given an n x n 2D matrix representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Follow up: Could you do this in-place?
 */
public class RotateImage {

  public void rotate(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }
    for (int layer = 0; layer < matrix.length / 2; layer++) {
      // [start, end]
      int start = layer;
      int end = matrix.length - layer - 1;
      for (int i = start; i < end; i++) {
        int tmp = matrix[layer][i];
        // left --> top
        matrix[layer][i] = matrix[matrix.length - 1 - i][layer];
        // bottom --> left
        matrix[matrix.length - 1 - i][layer] =
            matrix[matrix.length - 1 - layer][matrix.length - 1 - i];
        // right --> bottom
        matrix[matrix.length - 1 - layer][matrix.length - 1 - i] =
            matrix[i][matrix.length - 1 - layer];
        // top --> right
        matrix[i][matrix.length - 1 - layer] =
            tmp;
      }
    }
  }
}
