package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class MinimumWindowSubstringTest {

  MinimumWindowSubstring s = new MinimumWindowSubstring();
  
  @Test
  public void testMinWindow() {
    assertEquals("BANC", s.minWindow("ADOBECODEBANC", "ABC"));
  }

  @Test
  public void testMinWindow2() {
    assertEquals("aa", s.minWindow("aa", "aa"));
  }
}
