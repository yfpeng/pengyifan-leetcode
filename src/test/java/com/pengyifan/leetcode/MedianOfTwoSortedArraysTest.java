package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

  MedianOfTwoSortedArrays t = new MedianOfTwoSortedArrays();

  @Test
  public void testFindMedianSortedArrays() {
    assertEquals(
        10,
        t.findMedianSortedArrays(new int[] { 900 }, new int[] { 5, 8, 10, 20 }),
        0.00001);
  }

  @Test
  public void testFindMedianSortedArrays2() {
    assertEquals(
        4,
        t.findMedianSortedArrays(
            new int[] { 1, 2, 3 },
            new int[] { 4, 5, 6, 7 }),
        0.00001);
  }

  @Test
  public void testFindMedianSortedArrays3() {
    assertEquals(
        1,
        t.findMedianSortedArrays(
            new int[] {},
            new int[] { 1 }),
        0.00001);
  }

  @Test
  public void testFindMedianSortedArrays4() {
    assertEquals(
        2.5,
        t.findMedianSortedArrays(
            new int[] {},
            new int[] { 2, 3 }),
        0.00001);
  }

  @Test
  public void testFindMedianSortedArrays5() {
    assertEquals(
        4.5,
        t.findMedianSortedArrays(
            new int[] { 1, 2, 6, 7 },
            new int[] { 3, 4, 5, 8 }),
        0.00001);
  }

  @Test
  public void testFindMedianSortedArrays6() {
    assertEquals(
        2,
        t.findMedianSortedArrays(
            new int[] { 1, 1, 3, 3 },
            new int[] { 1, 1, 3, 3 }),
        0.00001);
  }

  @Test
  public void testFindMedianSortedArrays7() {
    assertEquals(
        3.5,
        t.findMedianSortedArrays(
            new int[] { 4, 5 },
            new int[] { 1, 2, 3, 6 }),
        0.00001);
  }
  
  @Test
  public void testFindMedianSortedArrays8() {
    assertEquals(
        2,
        t.findMedianSortedArrays(
            new int[] { 1, 2 },
            new int[] { 1, 2, 3 }),
        0.00001);
  }
}
