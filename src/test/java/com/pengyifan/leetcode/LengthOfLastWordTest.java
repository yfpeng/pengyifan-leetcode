package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class LengthOfLastWordTest {

  LengthOfLastWord t = new LengthOfLastWord();
  
  @Test
  public void testLengthOfLastWord() {
    assertEquals(5, t.lengthOfLastWord("Hello World"));
  }

  @Test
  public void testLengthOfLastWord2() {
    assertEquals(1, t.lengthOfLastWord("a "));
  }
}
