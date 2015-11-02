package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

  RotateArray s = new RotateArray();

  @Test
  public void testRotate() throws Exception {
    int [] i = new int[]{-1,-100,3,99};
    s.rotate(i, 3);
    assertEquals(-100, i[0]);
    assertEquals(-1, i[i.length - 1]);
  }
}