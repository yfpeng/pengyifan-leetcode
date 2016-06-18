package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTrailingZeroesTest {

  private FactorialTrailingZeroes t = new FactorialTrailingZeroes();

  @Test
  public void testTrailingZeroes() throws Exception {
    assertEquals(1, t.trailingZeroes(5));
    assertEquals(7, t.trailingZeroes(30));
    assertEquals(452137076, t.trailingZeroes(1808548329));
  }
}