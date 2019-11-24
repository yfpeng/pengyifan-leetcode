package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetMatrixZeroesTest {

  SetMatrixZeroes t = new SetMatrixZeroes();

  @Test
  public void testSetZeroes2() {
    int[][] matrix = new int[][] { { 0, 1 } };
    t.setZeroes2(matrix);
    assertArrayEquals(new int[] { 0, 0 }, matrix[0]);
  }

  @Test
  public void testSetZeroes3() {
    int[][] matrix = new int[][] { { -1 }, { 2 }, { 3 } };
    t.setZeroes2(matrix);
    assertArrayEquals(new int[] { -1 }, matrix[0]);
  }

  @Test
  public void testSetZeroes() {
    int[][] matrix = new int[][] { { 0, 0, 0, 5 }, { 4, 3, 1, 4 },
        { 0, 1, 1, 4 }, { 1, 2, 1, 3 }, { 0, 0, 1, 1 } };
    t.setZeroes2(matrix);
    assertArrayEquals(new int[] { 0, 0, 0, 4 }, matrix[1]);
    assertArrayEquals(new int[] { 0, 0, 0, 3 }, matrix[3]);
  }
}
