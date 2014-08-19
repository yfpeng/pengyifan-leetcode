package com.pengyifan.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers, find the length of the longest
 * consecutive elements sequence.
 * <p>
 * For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements
 * sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p>
 * Your algorithm should run in O(n) complexity.
 */
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
