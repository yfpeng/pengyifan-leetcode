package com.pengyifan.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

  public int longestConsecutive(int[] num) {
    if (num == null || num.length == 0) {
      return 0;
    }
    int maxLength = 0;
    // number, visited
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < num.length; i++) {
      set.add(num[i]);
    }

    for (int i = 0; i < num.length; i++) {
      int length = 1;
      int n = num[i];
      // right
      while (set.contains(n + 1)) {
        length++;
        n++;
        set.remove(n);
      }
      n = num[i];
      // left
      while (set.contains(n - 1)) {
        length++;
        n--;
        set.remove(n);
      }
      if (maxLength < length) {
        maxLength = length;
      }
    }
    return maxLength;
  }
}
