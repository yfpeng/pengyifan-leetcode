package com.pengyifan.leetcode;

import java.util.HashMap;

/**
 * Given an array of size n, find the majority element. The majority element is the element that
 * appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
  public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> counter = new HashMap<>();
    for (int i : nums) {
      if (counter.containsKey(i)) {
        counter.put(i, counter.get(i) + 1);
      } else {
        counter.put(i, 1);
      }
    }
    int max = 0;
    int mc = 0;
    for (int i: counter.keySet()) {
      if (mc < counter.get(i)) {
        max = i;
        mc = counter.get(i);
      }
    }
    return max;
  }
}
