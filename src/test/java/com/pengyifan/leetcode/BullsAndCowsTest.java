package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BullsAndCowsTest {

  private BullsAndCows t = new BullsAndCows();

  @Test
  public void testGetHint() throws Exception {
    assertEquals("1A3B", t.getHint("1807", "7810"));
    assertEquals("1A1B", t.getHint("1123", "0111"));
    assertEquals("0A4B", t.getHint("1122", "2211"));
    assertEquals("3A0B", t.getHint("1122", "1222"));
  }
}