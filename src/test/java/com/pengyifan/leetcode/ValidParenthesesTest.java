package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidParenthesesTest {

  ValidParentheses t = new ValidParentheses();

  @Test
  public void test() {
    assertTrue(t.isValid("()"));
    assertTrue(t.isValid("()[]{}"));
    assertFalse(t.isValid("(]"));
    assertFalse(t.isValid("([)]"));
  }

}
