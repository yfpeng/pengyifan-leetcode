package com.pengyifan.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LargestRectangleInHistogramTest {

  LargestRectangleInHistogram t = new LargestRectangleInHistogram();
  
  @Test
  public void test() {
    assertEquals(10, t.largestRectangleArea(new int[] {2,1,5,6,2,3}));
  }

}
