package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianFinderTest {

  @Test
  public void testFindMedian() throws Exception {
    MedianFinder mf = new MedianFinder();
    mf.addNum(6);
    assertEquals(6, mf.findMedian(), 0.000001);
    mf.addNum(10);
    assertEquals(8, mf.findMedian(), 0.000001);
    mf.addNum(2);
    assertEquals(6, mf.findMedian(), 0.000001);
    mf.addNum(6);
    assertEquals(6, mf.findMedian(), 0.000001);
    mf.addNum(5);
    assertEquals(6, mf.findMedian(), 0.000001);
    mf.addNum(0);
    assertEquals(5.5, mf.findMedian(), 0.000001);
    mf.addNum(6);
    assertEquals(6, mf.findMedian(), 0.000001);
    mf.addNum(3);
    assertEquals(5.5, mf.findMedian(), 0.000001);
    mf.addNum(1);
    assertEquals(5, mf.findMedian(), 0.000001);
    mf.addNum(0);
    assertEquals(4, mf.findMedian(), 0.000001);
    mf.addNum(0);
    assertEquals(3, mf.findMedian(), 0.000001);
  }
}