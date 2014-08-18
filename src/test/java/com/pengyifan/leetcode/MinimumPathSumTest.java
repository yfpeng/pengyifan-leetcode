package com.pengyifan.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumPathSumTest {

  MinimumPathSum t = new MinimumPathSum();
  
  @Test
  public void test() {
    assertEquals(2, t.minPathSum(new int[][] {{0,1},{2,1}}));
  }

}
