package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseVowelsOfAStringTest {

  private ReverseVowelsOfAString t = new ReverseVowelsOfAString();

  @Test
  public void testReverseVowels() throws Exception {
    assertEquals("holle", t.reverseVowels("hello"));
    assertEquals("leotcede", t.reverseVowels("leetcode"));
  }
}