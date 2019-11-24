package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountAndSayTest {

  private CountAndSay t = new CountAndSay();

  @Test
  public void testCountAndSay() throws Exception {
    assertEquals("11", t.countAndSay(2));
    assertEquals("111221", t.countAndSay(5));
    assertEquals("312211", t.countAndSay(6));
  }
}