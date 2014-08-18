package com.pengyifan.leetcode;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ThreeSumTest {

  ThreeSum t = new ThreeSum();

  @Test
  public void test() {
    List<List<Integer>> actual = t.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
    assertEquals(2, actual.size());
    assertThat(actual, hasItem(Arrays.asList(-1, 0, 1)));
    assertThat(actual, hasItem(Arrays.asList(-1, -1, 2)));
  }

  @Test
  public void test_empty() {
    List<List<Integer>> actual = t.threeSum(new int[] {});
    assertEquals(0, actual.size());
  }
}
