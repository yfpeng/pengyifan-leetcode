package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestPalindromeTest {

  ShortestPalindrome s = new ShortestPalindrome();

  @Test
  public void testShortestPalindrome() throws Exception {
    assertEquals("aba", s.shortestPalindrome("ba"));
  }
}