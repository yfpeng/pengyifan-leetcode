package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

  RemoveDuplicatesFromSortedArray t = new RemoveDuplicatesFromSortedArray();

  @Test
  public void test() {
    int[] a = { 1, 1, 2 };
    assertEquals(2, t.removeDuplicates(a));
    assertEquals(1, a[0]);
    assertEquals(2, a[1]);
  }

}
