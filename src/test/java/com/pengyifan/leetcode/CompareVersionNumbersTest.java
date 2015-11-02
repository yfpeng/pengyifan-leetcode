package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersionNumbersTest {

  CompareVersionNumbers s = new CompareVersionNumbers();

  @Test
  public void testCompareVersion() throws Exception {
    assertEquals(1, s.compareVersion("0.1", "0.0.1"));
    assertEquals(0, s.compareVersion("1.0", "1"));
  }
}