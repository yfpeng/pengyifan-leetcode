package com.pengyifan.leetcode;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FourSumTest {

  FourSum t = new FourSum();

  @Test
  public void testFourSum() {
    List<List<Integer>> actual = t.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0);
    assertThat(actual, hasItem(Arrays.asList(-1, 0, 0, 1)));
    assertThat(actual, hasItem(Arrays.asList(-2, -1, 1, 2)));
    assertThat(actual, hasItem(Arrays.asList(-2, 0, 0, 2)));
  }

  @Test
  public void testFourSum2() {
    List<List<Integer>> actual = t.fourSum(new int[] { 1, -2, -5, -4, -3, 3, 3,
        5 }, -11);
    assertThat(actual, hasItem(Arrays.asList(-5, -4, -3, 1)));
  }

  @Test
  public void testFourSum3() {
    List<List<Integer>> actual = t.fourSum(new int[] { -3, -2, -1, 0, 0, 1, 2,
        3 }, 0);
    System.out.println(actual);
    assertEquals(8, actual.size());
    assertThat(actual, hasItem(Arrays.asList(-3, -2, 2, 3)));
    assertThat(actual, hasItem(Arrays.asList(-3, -1, 1, 3)));
    assertThat(actual, hasItem(Arrays.asList(-3, 0, 0, 3)));
    assertThat(actual, hasItem(Arrays.asList(-3, 0, 1, 2)));
    assertThat(actual, hasItem(Arrays.asList(-2, -1, 0, 3)));
    assertThat(actual, hasItem(Arrays.asList(-2, -1, 1, 2)));
    assertThat(actual, hasItem(Arrays.asList(-2, 0, 0, 2)));
    assertThat(actual, hasItem(Arrays.asList(-1, 0, 0, 1)));
  }
}
