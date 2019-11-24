package com.pengyifan.leetcode;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PermutationsTest {

  Permutations t = new Permutations();

  @Test
  public void test() {
    List<List<Integer>> actual = t.permute(new int[] { 1, 2, 3 });
    assertThat(actual, hasItem(Arrays.asList(1, 2, 3)));
    assertThat(actual, hasItem(Arrays.asList(1, 3, 2)));
    assertThat(actual, hasItem(Arrays.asList(2, 1, 3)));
    assertThat(actual, hasItem(Arrays.asList(2, 3, 1)));
    assertThat(actual, hasItem(Arrays.asList(3, 1, 2)));
    assertThat(actual, hasItem(Arrays.asList(3, 2, 1)));
  }

}
