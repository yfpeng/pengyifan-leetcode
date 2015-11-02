package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers, find out whether there are two distinct indices i and j in the array
 * such that the difference between nums[i] and nums[j] is at most t and the difference between i
 * and j is at most k.
 */
public class ContainsDuplicateIII {
  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    List<C> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      list.add(new C(i, nums[i]));
    }
    Collections.sort(list);

    for (int i = 0; i < list.size(); i++) {
      C c1 = list.get(i);
      for (int j = i + 1; j < list.size(); j++) {
        C c2 = list.get(j);
        if (Math.abs(c1.num - c2.num) <= t && Math.abs(c1.i - c2.i) <= k) {
          return true;
        }
        if (Math.abs(c1.num - c2.num) > t) {
          break;
        }
      }
    }
    return false;
  }

  class C implements Comparable<C> {
    long num;
    int i;

    public C(int i, int num) {
      this.i = i;
      this.num = num;
    }

    @Override
    public int compareTo(C c) {
      int i = Long.compare(num, c.num);
      if (i == 0) {
        i = Integer.compare(i, c.i);
      }
      return i;
    }
  }
}
