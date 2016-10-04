package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDifferenceTest {

  private FindTheDifference t = new FindTheDifference();

  @Test
  public void testFindTheDifference() throws Exception {
    assertEquals('e', t.findTheDifference("abcd", "abcde"));
    assertEquals('y', t.findTheDifference("", "y"));
  }
}