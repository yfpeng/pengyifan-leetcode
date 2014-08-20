package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class InterleavingStringTest {

  InterleavingString t = new InterleavingString();
  
  @Test
  public void testIsInterleave() {
    assertTrue(t.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    assertFalse(t.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
  }
  
  @Test
  public void testIsInterleave2() {
    assertTrue(t.isInterleave("a", "", "a"));
  }

  @Test
  public void testIsInterleave_null() {
    assertFalse(t.isInterleave(null, "dbbca", "aadbbbaccc"));
  }
}
