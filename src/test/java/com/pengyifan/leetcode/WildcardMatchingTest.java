package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class WildcardMatchingTest {

  WildcardMatching s = new WildcardMatching();

  @Test
  public void testIsMatch() {
    assertTrue(s.isMatch("aa", "aa"));
    assertTrue(s.isMatch("aa", "*"));
    assertTrue(s.isMatch("aa", "a*"));
    assertTrue(s.isMatch("ab", "?*"));

    assertFalse(s.isMatch("aa", "a"));
    assertFalse(s.isMatch("aaa", "aa"));
    assertFalse(s.isMatch("aab", "c*a*b"));
  }

}
