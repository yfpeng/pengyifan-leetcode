package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordPatternTest {

  private WordPattern s = new WordPattern();

  @Test
  public void testWordPattern() throws Exception {
    assertFalse(s.wordPattern("abba", "dog dog dog dog"));
  }

  @Test
  public void testWordPattern2() throws Exception {
    assertTrue(s.wordPattern("abba", "dog cat cat dog"));
  }

  @Test
  public void testWordPattern3() throws Exception {
    assertFalse(s.wordPattern("ab", "dog dog"));
  }
}