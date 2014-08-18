package com.pengyifan.leetcode;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ThreeSumTest {

  ThreeSum t = new ThreeSum();

  @Test
  public void test() {
    List<List<Integer>> actual = t.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
    System.out.println(actual);
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
