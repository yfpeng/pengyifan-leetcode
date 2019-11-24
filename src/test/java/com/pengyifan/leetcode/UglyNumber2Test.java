package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UglyNumber2Test {

  UglyNumber2 t = new UglyNumber2();

  @Test
  public void testNthUglyNumber() throws Exception {
    assertEquals(12, t.nthUglyNumber(10));
    assertEquals(15, t.nthUglyNumber(11));
  }
}