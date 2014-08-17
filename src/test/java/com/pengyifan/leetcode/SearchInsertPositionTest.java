package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SearchInsertPositionTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  private SearchInsertPosition t = new SearchInsertPosition();

  @Test
  public void testSearchInsert() {
    assertEquals(2, t.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    assertEquals(1, t.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    assertEquals(4, t.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    assertEquals(0, t.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
  }
  
  @Test
  public void testSearchInsert_zero() {
    assertEquals(0, t.searchInsert(new int[] {}, 5));
  }

  @Test
  public void testSearchInsert_null() {
    thrown.expect(NullPointerException.class);
    t.searchInsert(null, 5);
  }
}
