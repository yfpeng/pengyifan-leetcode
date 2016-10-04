package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumIITest {

  private TwoSumII t = new TwoSumII();

  @Test
  public void testTwoSum() throws Exception {
    int[] r = t.twoSum(new int[]{2, 7, 11, 15}, 9);
    assertEquals(1, r[0]);
    assertEquals(2, r[1]);
  }
}