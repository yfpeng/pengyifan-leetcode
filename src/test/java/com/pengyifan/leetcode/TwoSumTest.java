package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class TwoSumTest {

  TwoSum t = new TwoSum();
  
  @Test
  public void test() {
    int [] actual = t.twoSum(new int[]{2,7,11,15}, 9);
    assertEquals(1, actual[0]);
    assertEquals(2, actual[1]);
  }

  @Test
  public void test2() {
    int [] actual = t.twoSum(new int[]{5,75,25}, 100);
    assertEquals(2, actual[0]);
    assertEquals(3, actual[1]);
  }
}
