package com.pengyifan.leetcode;

import java.util.Arrays;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note
 * that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */
public class TwoSum {

  public int[] twoSum(int[] num, int target) {
    if (num == null || num.length == 0) {
      return null;
    }
    Ele[] list = new Ele[num.length];
    for (int i = 0; i < num.length; i++) {
      list[i] = new Ele(num[i], i);
    }
    Arrays.sort(list);
    int begin = 0;
    int end = list.length - 1;
    while (begin <= end) {
      if (list[begin].num + list[end].num > target) {
        end--;
      } else if (list[begin].num + list[end].num < target) {
        begin++;
      } else {
        int index1 = list[begin].index + 1;
        int index2 = list[end].index + 1;
        return new int[] { Math.min(index1, index2), Math.max(index1, index2) };
      }
    }
    return null;
  }

  class Ele implements Comparable<Ele> {

    int num;
    int index;

    Ele(int num, int index) {
      this.num = num;
      this.index = index;
    }

    public int compareTo(Ele o) {
      if (num < o.num) {
        return -1;
      } else if (num == o.num) {
        return 0;
      } else {
        return 1;
      }
    }

  }
}
