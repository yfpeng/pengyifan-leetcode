package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class EditDistanceTest {
  
  EditDistance s = new EditDistance();

  @Test
  public void testMinDistance() {
    assertEquals(1, s.minDistance("a", "ab"));
    assertEquals(1, s.minDistance("", "a"));
  }

}
