package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

  ValidAnagram t = new ValidAnagram();

  @Test
  public void testIsAnagram() throws Exception {
    assertTrue(t.isAnagram("anagram", "nagaram"));
    assertFalse(t.isAnagram("rat", "car"));
  }
}