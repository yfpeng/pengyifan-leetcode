package com.pengyifan.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsInAStringTest {

  private ReverseWordsInAString t = new ReverseWordsInAString();

  @Test
  public void testReverseWords() {
    assertEquals("blue is sky the", t.reverseWords("the sky is blue"));
  }
  
  @Test
  public void testReverseWords_empty() {
    assertEquals("", t.reverseWords(""));
  }
  
  @Test
  public void testReverseWords_null() {
    assertEquals(null, t.reverseWords(null));
  }
}
