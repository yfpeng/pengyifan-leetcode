package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JumpGame2Test {

  private static int [] stairs;
  
  JumpGame2 t = new JumpGame2();

  @Test
  public void testJump() {
    assertEquals(2, t.jump(new int[] { 2, 3, 1, 1, 4 }));
  }
  
  @Before
  public void setUp() {
    stairs = new int[25002];
    for(int i=25000; i>= 0;i--) {
      stairs[25000-i] = i;
    }
    stairs[25000] = 1;
    stairs[25001] = 0;
  }

  @Test
  public void testJump2() {
    assertEquals(
        2,
        t.jump(stairs));
  }
}
