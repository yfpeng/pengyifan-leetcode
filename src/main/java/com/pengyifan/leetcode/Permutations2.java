package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Given a collection of numbers that might contain duplicates, return all
 * possible unique permutations.
 * <p>
 * For example, [1,1,2] have the following unique permutations: [1,1,2],
 * [1,2,1], and [2,1,1].
 */
public class Permutations2 {

  public List<List<Integer>> permuteUnique(int[] num) {
    if (num == null) {
      return null;
    }
    List<List<Integer>> total = new ArrayList<List<Integer>>();
    if (num.length == 0) {
      return total;
    }
    TreeSet<Ele> set = new TreeSet<Ele>();
    permuteHelper(num, num.length, set);

    for (Ele e : set) {
      total.add(toList(e.num));
    }
    return total;
  }

  private void permuteHelper(int[] num, int indexFromEnd, TreeSet<Ele> set) {
    if (indexFromEnd <= 0) {
      set.add(new Ele(num));
    } else {
      permuteHelper(num, indexFromEnd - 1, set);
      int index = num.length - indexFromEnd;
      for (int i = index + 1; i < num.length; i++) {
        swap(num, index, i);
        permuteHelper(num, indexFromEnd - 1, set);
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

  class Ele implements Comparable<Ele> {

    final int[] num;

    Ele(int[] num) {
      // hard copy
      this.num = new int[num.length];
      System.arraycopy(num, 0, this.num, 0, num.length);
    }

    public int compareTo(Ele o) {
      for (int i = 0; i < num.length; i++) {
        if (num[i] < o.num[i]) {
          return -1;
        } else if (num[i] > o.num[i]) {
          return 1;
        }
      }
      return 0;
    }

  }
}
