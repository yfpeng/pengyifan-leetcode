package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UglyNumberTest {

  UglyNumber t = new UglyNumber();

  @Test
  public void testIsUgly() throws Exception {
    assertTrue(t.isUgly(2));
    assertTrue(t.isUgly(6));
    assertFalse(t.isUgly(7));
    assertFalse(t.isUgly(0));
  }
}