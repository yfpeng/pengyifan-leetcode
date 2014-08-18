package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestConsecutiveSequenceTest {

  LongestConsecutiveSequence s = new LongestConsecutiveSequence();

  @Test
  public void testLongestConsecutive() {
    assertEquals(4, s.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
    assertEquals(3, s.longestConsecutive(new int[] { 1, 2, 0, 1 }));
  }
  
  @Test
  public void testLongestConsecutive2() {
    assertEquals(
        9,
        s.longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }));
  }

  @Test
  public void testLongestConsecutive_null() {
    assertEquals(0, s.longestConsecutive(null));
  }

  @Test
  public void testLongestConsecutive_empty() {
    assertEquals(0, s.longestConsecutive(new int[] {}));
  }
}
