package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] num) {
    if (num == null || num.length == 0) {
      return Collections.emptyList();
    }
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    Arrays.sort(num);
    for (int i = 0; i < num.length; i++) {
      if (num[i] > 0) {
        continue;
      }
      if (i != 0 && num[i] == num[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < num.length; j++) {
        if (num[i] + num[j] > 0) {
          continue;
        }
        if (j != i + 1 && num[j] == num[j - 1]) {
          continue;
        }
        for (int k = j + 1; k < num.length; k++) {
          if (k != j + 1 && num[k] == num[k - 1]) {
            continue;
          }
          if (num[i] + num[j] + num[k] > 0) {
            continue;
          }
          if (num[i] + num[j] + num[k] == 0) {
            list.add(Arrays.asList(num[i], num[j], num[k]));
          }
        }
      }
    }
    return list;
  }
}
