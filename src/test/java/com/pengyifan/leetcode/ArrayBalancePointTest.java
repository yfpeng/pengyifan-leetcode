package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayBalancePointTest {

  ArrayBalancePoint s = new ArrayBalancePoint();
  
  @Test
  public void testBalancePoint() {
    assertEquals(3, s.balancePoint(new int[] {5, 4, 0, 19, 3, 4, 2, 0}));
    assertEquals(-1, s.balancePoint(new int[] {5, 4, 2, 1}));
    assertEquals(2, s.balancePoint(new int[] {5, 4, 0, 3, 4, 2, 0}));
  }

}
