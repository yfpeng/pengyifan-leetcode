package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ContainerWithMostWaterTest {

  ContainerWithMostWater t = new ContainerWithMostWater();

  @Test
  public void testMaxArea() {
    assertEquals(1, t.maxArea(new int[] { 1, 1 }));
  }

  @Test
  public void testMaxArea2() {
    assertEquals(0, t.maxArea(new int[] { 0, 2 }));
  }

  @Test
  public void testMaxArea3() {
    assertEquals(1, t.maxArea(new int[] { 2, 1 }));
  }
  
  @Test
  public void testMaxArea4() {
    assertEquals(9, t.maxArea(new int[] { 3,2,1,3 }));
  }
  
  @Test
  @Ignore
  public void testMaxArea5() {
    assertEquals(4, t.maxArea(new int[] { 1,2,4,3 }));
  }
}
