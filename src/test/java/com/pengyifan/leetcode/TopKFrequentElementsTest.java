package com.pengyifan.leetcode;

import org.junit.Test;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class TopKFrequentElementsTest {

  private TopKFrequentElements t = new TopKFrequentElements();
  @Test
  public void testTopKFrequent() throws Exception {
    assertThat(t.topKFrequent(new int[]{1}, 1), containsInAnyOrder(1));
    assertThat(t.topKFrequent(new int[]{1,1,2,2,3}, 2), containsInAnyOrder(1,2));
    assertThat(t.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2), containsInAnyOrder(-1,2));
  }
}