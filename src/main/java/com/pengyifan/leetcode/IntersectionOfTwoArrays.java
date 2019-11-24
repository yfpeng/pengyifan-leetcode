package com.pengyifan.leetcode;

import java.util.HashSet;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    if (nums1 == null || nums2==null) {
      return null;
    }
    HashSet<Integer> set = new HashSet<>(nums1.length);
    for(int i: nums1) {
      set.add(i);
    }
    HashSet<Integer> set2 = new HashSet<>(nums2.length);
    for(int i: nums2) {
      if (set.contains(i)) {
        set2.add(i);
      }
    }
    int [] r = new int[set2.size()];
    int index = 0;
    for (int i: set2) {
      r[index] = i;
      index++;
    }
    return r;
  }
}
