package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class ValidPalindromeTest {

  ValidPalindrome s = new ValidPalindrome();
  
  @Test
  public void testIsPalindrome() {
    assertTrue(s.isPalindrome("A man, a plan, a canal: Panama"));
    assertTrue(s.isPalindrome(".,"));
    assertFalse(s.isPalindrome("1a2"));
    assertFalse(s.isPalindrome("race a car"));
  }

}
