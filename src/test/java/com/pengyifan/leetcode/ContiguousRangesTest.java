package com.pengyifan.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ContiguousRangesTest {

  ContiguousRanges c = new ContiguousRanges();

  @Test
  public void testFindAll() {
    List<List<Integer>> rst = c.findAll(new int[] { 1, 2, 3, 4, 5 });
    assertEquals(1, rst.size());
    assertEquals(0, rst.get(0).get(0).intValue());
    assertEquals(4, rst.get(0).get(1).intValue());
  }

  @Test
  public void testFindAll2() {
    List<List<Integer>> rst = c.findAll(new int[] { 1, 2, 3, 5 });
    assertEquals(2, rst.size());
    assertEquals(0, rst.get(0).get(0).intValue());
    assertEquals(2, rst.get(0).get(1).intValue());

    assertEquals(3, rst.get(1).get(0).intValue());
    assertEquals(3, rst.get(1).get(1).intValue());
  }

  @Test
  public void testFindAll3() {
    List<List<Integer>> rst = c.findAll(new int[] { 1, 2, 3, 5, 7 });
    assertEquals(3, rst.size());
    assertEquals(0, rst.get(0).get(0).intValue());
    assertEquals(2, rst.get(0).get(1).intValue());

    assertEquals(3, rst.get(1).get(0).intValue());
    assertEquals(3, rst.get(1).get(1).intValue());

    assertEquals(4, rst.get(2).get(0).intValue());
    assertEquals(4, rst.get(2).get(1).intValue());
  }
}
