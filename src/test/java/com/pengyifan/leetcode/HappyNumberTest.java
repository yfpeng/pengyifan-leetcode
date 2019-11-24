package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

  private HappyNumber t = new HappyNumber();

  @Test
  public void testIsHappy() throws Exception {
    assertTrue(t.isHappy(19));
    assertFalse(t.isHappy(2));
  }
}