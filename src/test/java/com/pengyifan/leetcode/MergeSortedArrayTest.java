package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class MergeSortedArrayTest {

  MergeSortedArray s = new MergeSortedArray();
  
  @Test
  public void testMerge() {
    int [] A = new int[1];
    int [] B = new int[]{1};
    s.merge(A, 0, B, 1);
    assertEquals(1, A[0]);
  }

}
