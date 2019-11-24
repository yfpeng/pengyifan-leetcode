package com.pengyifan.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i
 * and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class ContainsDuplicateII {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();

    for (int j = 0; j < nums.length; j++) {
      if (j > k) {
        set.remove(nums[j - k - 1]);
      }
      if (!set.add(nums[j])) {
        return true;
      }
    }
    return false;
  }
}
