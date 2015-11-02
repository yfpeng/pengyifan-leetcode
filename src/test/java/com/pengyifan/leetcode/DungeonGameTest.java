package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonGameTest {

  DungeonGame s = new DungeonGame();

  @Test
  public void testCalculateMinimumHP() throws Exception {
    assertEquals(7, s.calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}));
  }
}