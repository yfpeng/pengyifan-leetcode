package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {

  MissingNumber t = new MissingNumber();

  @Test
  public void testMissingNumber() throws Exception {
    assertEquals(2, t.missingNumber(new int[]{0, 1, 3}));
  }
}