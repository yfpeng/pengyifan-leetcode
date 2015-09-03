package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDigitOneTest {

  NumberOfDigitOne t = new NumberOfDigitOne();

  @Test
  public void testCountDigitOne() throws Exception {
    assertEquals(6, t.countDigitOne(13));
  }
}