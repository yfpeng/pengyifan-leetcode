package com.pengyifan.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PascalsTriangle2Test {

  PascalsTriangle2 t = new PascalsTriangle2();

  @Test
  public void test() {
    assertEquals(Arrays.asList(1, 3, 3, 1), t.getRow(3));
  }

}
