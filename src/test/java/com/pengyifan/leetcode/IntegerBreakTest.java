package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerBreakTest {

  private IntegerBreak t = new IntegerBreak();

  @Test
  public void testIntegerBreak() throws Exception {
    assertEquals(1, t.integerBreak(2));
    assertEquals(36, t.integerBreak(10));
  }
}