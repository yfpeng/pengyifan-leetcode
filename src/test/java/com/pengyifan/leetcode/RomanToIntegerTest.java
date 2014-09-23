package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class RomanToIntegerTest {

  RomanToInteger s = new RomanToInteger();
  
  @Test
  public void testRomanToInt() {
    assertEquals(2014, s.romanToInt("MMXIV"));
    assertEquals(1903, s.romanToInt("MDCDIII"));
  }

}
