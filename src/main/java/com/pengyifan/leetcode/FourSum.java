package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target.
 * <p>
 * Note:
 * <p>
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤
 * b ≤ c ≤ d)
 * <p>
 * The solution set must not contain duplicate quadruplets.
 */
public class FourSum {

  public List<List<Integer>> fourSum(int[] num, int target) {
    if (num == null || num.length == 0) {
      return Collections.emptyList();
    }
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    Arrays.sort(num);
    for (int begin1 = 0; begin1 < num.length; begin1++) {
      for (int end1 = begin1 + 3; end1 < num.length; end1++) {
        int begin2 = begin1 + 1;
        int end2 = end1 - 1;
        while (begin2 < end2) {
          if (num[begin1] + num[begin2] + num[end2] + num[end1] == target) {
            if (!contains(list, num[begin1], num[begin2], num[end2], num[end1])) {
              list.add(Arrays
                  .asList(num[begin1], num[begin2], num[end2], num[end1]));
            }
            if (num[begin2] == num[begin2 + 1]) {
              begin2++;
            } else {
              end2--;
            }
          } else if (num[begin1] + num[begin2] + num[end2] + num[end1] > target) {
            end2--;
          } else {
            begin2++;
          }
        }
      }
    }
    return list;
  }

  private boolean
      contains(List<List<Integer>> list, int a, int b, int c, int d) {
    for (List<Integer> solution : list) {
      if (solution.get(0) == a
          && solution.get(1) == b
          && solution.get(2) == c
          && solution.get(3) == d) {
        return true;
      }
    }
    return false;
  }
}
