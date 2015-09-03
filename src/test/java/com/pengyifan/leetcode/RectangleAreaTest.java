package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleAreaTest {

  RectangleArea t = new RectangleArea();

  @Test
  public void testComputeArea() throws Exception {
    assertEquals(45, t.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    assertEquals(16, t.computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
    assertEquals(24, t.computeArea(-2, -2, 2, 2, -3, -3, 3, -1));
  }
}