package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContiguousRanges {

  public List<List<Integer>> findAll(int[] array) {
    if (array == null || array.length == 0) {
      return Collections.emptyList();
    }

    List<List<Integer>> solutions = new ArrayList<List<Integer>>();
    int target = 0;
    while (target < array.length) {
      int end = binarySearch(array, target, target, array.length - 1);
      List<Integer> solution = new ArrayList<Integer>();
      solution.add(target);
      solution.add(end);
      solutions.add(solution);
      target = end + 1;
    }
    return solutions;
  }

  private int binarySearch(int[] array, int target, int start, int end) {
    if (start == end) {
      return start;
    } else if (start + 1 == end) {
      if (array[end] - array[target] == end - target) {
        return end;
      } else {
        return start;
      }
    }
    int mid = (start + end) / 2;
    if (array[mid] - array[target] > mid - target) {
      return binarySearch(array, target, start, mid - 1);
    } else {
      return binarySearch(array, target, mid, end);
    }
  }
}
