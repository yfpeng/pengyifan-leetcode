package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class UniquePathsTest {

  UniquePaths s = new UniquePaths();
  
  @Test
  public void test() {
    assertEquals(193536720, s.uniquePaths(23, 12));
  }

}
