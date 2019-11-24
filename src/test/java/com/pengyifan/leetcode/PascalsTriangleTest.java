package com.pengyifan.leetcode;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PascalsTriangleTest {

  PascalsTriangle t = new PascalsTriangle();

  @Test
  public void testGenerate() {
    List<List<Integer>> lists = t.generate(5);
    assertThat(lists, hasItem(Arrays.asList(1)));
    assertThat(lists, hasItem(Arrays.asList(1, 1)));
    assertThat(lists, hasItem(Arrays.asList(1, 2, 1)));
    assertThat(lists, hasItem(Arrays.asList(1, 3, 3, 1)));
    assertThat(lists, hasItem(Arrays.asList(1, 4, 6, 4, 1)));
  }

}
