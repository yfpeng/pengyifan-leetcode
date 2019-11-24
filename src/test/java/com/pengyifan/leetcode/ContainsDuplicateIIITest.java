package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateIIITest {

  ContainsDuplicateIII s = new ContainsDuplicateIII();

  @Test
  public void testContainsNearbyAlmostDuplicate() throws Exception {
    int[] as = new int[]{-1,2147483647};
    assertFalse(s.containsNearbyAlmostDuplicate(as, 1, 2147483647));
  }
}