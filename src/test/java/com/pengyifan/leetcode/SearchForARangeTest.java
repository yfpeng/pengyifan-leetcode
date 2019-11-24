package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchForARangeTest {

  SearchForARange t = new SearchForARange();

  @Test
  public void testSearchRange() {
    int[] actual = t.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8);
    assertEquals(3, actual[0]);
    assertEquals(4, actual[1]);
  }

  @Test
  public void testSearchRange2() {
    int[] actual = t.searchRange(new int[] { 1 }, 0);
    assertEquals(-1, actual[0]);
    assertEquals(-1, actual[1]);
  }
  
  @Test
  public void testSearchRange3() {
    int[] actual = t.searchRange(new int[] { 1,2,2 }, 2);
    assertEquals(1, actual[0]);
    assertEquals(2, actual[1]);
  }
  
  @Test
  public void testSearchRange4() {
    int[] actual = t.searchRange(new int[] { 0,0,1,1,1,4,5,5 }, 2);
    assertEquals(-1, actual[0]);
    assertEquals(-1, actual[1]);
  }
}
