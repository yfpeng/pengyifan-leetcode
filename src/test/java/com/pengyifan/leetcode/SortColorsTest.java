package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class SortColorsTest {

  SortColors s = new SortColors();
  
  @Test
  public void testSortColors() {
    int [] A = new int[]{1,2,0};
    s.sortColors(A);
    assertEquals(0, A[0]);
    assertEquals(1, A[1]);
    assertEquals(2, A[2]);
  }
  
  @Test
  public void testSortColors2() {
    int [] A = new int[]{2,0,0};
    s.sortColors(A);
    assertEquals(0, A[0]);
    assertEquals(0, A[1]);
    assertEquals(2, A[2]);
  }

  @Test
  public void testSortColorsTwoPass() {
    int [] A = new int[]{1,2,0};
    s.sortColorsTwoPass(A);
    assertEquals(0, A[0]);
    assertEquals(1, A[1]);
    assertEquals(2, A[2]);
  }

}
