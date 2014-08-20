package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateImageTest {

  RotateImage t = new RotateImage();

  @Test
  public void test() {
    int[][] matrix = new int[][] { { 1, 2 }, { 3, 4 } };
    int[][] expected = new int[][] { { 3, 1 }, { 4, 2 } };
    t.rotate(matrix);
    assertArrayEquals(expected[0], matrix[0]);
    assertArrayEquals(expected[1], matrix[1]);
  }

}
