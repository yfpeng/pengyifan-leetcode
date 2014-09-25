package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumProductSubarrayTest {

  MaximumProductSubarray s = new MaximumProductSubarray();

  @Test
  public void testMaxProduct() {
    assertEquals(-2, s.maxProduct(new int[] { -2 }));
    assertEquals(6, s.maxProduct(new int[] { 2, 3 }));
    assertEquals(0, s.maxProduct(new int[] { -2, 0, -1 }));
    assertEquals(180, s.maxProduct(new int[] { 6, -3, -10, 0, 2 }));
    assertEquals(60, s.maxProduct(new int[] { -1, -3, -10, 0, 60 }));
    assertEquals(80, s.maxProduct(new int[] { -2, -3, 0, -2, -40 }));
    assertEquals(1, s.maxProduct(new int[] { -1, -1 }));
  }

  @Test
  public void testMaxProduct2() {
    assertEquals(4, s.maxProduct(new int[] { 2, -1, -1, 2, 0, -3, 3 }));
  }
}
