package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of numbers, return all possible permutations.
 * <p>
 * For example, [1,2,3] have the following permutations: [1,2,3], [1,3,2],
 * [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
public class Permutations {

  public List<List<Integer>> permute(int[] num) {
    if (num == null) {
      return null;
    }
    List<List<Integer>> total = new ArrayList<List<Integer>>();
    if (num.length == 0) {
      return total;
    }
    permuteHelper(num, num.length, total);
    return total;
  }

  private void permuteHelper(int[] num, int indexFromEnd,
      List<List<Integer>> total) {
    if (indexFromEnd <= 0) {
      total.add(toList(num));
    } else {
      permuteHelper(num, indexFromEnd - 1, total);
      int index = num.length - indexFromEnd;
      for (int i = index + 1; i < num.length; i++) {
        swap(num, index, i);
        permuteHelper(num, indexFromEnd - 1, total);
        swap(num, i, index);
      }
    }
  }

  private List<Integer> toList(int[] num) {
    List<Integer> list = new ArrayList<Integer>();
    for (int n : num) {
      list.add(n);
    }
    return list;
  }

  private void swap(int[] num, int index1, int index2) {
    int i = num[index1];
    num[index1] = num[index2];
    num[index2] = i;
  }
}
