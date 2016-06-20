package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

  private LongestSubstringWithoutRepeatingCharacters t =
      new LongestSubstringWithoutRepeatingCharacters();

  @Test
  public void testLengthOfLongestSubstring() throws Exception {
    assertEquals(1, t.lengthOfLongestSubstring("eee"));
    assertEquals(3, t.lengthOfLongestSubstring("dvdf"));
    assertEquals(3, t.lengthOfLongestSubstring("abcabcbb"));
  }
}