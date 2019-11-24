package com.pengyifan.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * <p>
 * By listing and labeling all of the permutations in order, We get the
 * following sequence (ie, for n = 3):
 * <p>
 * "123" "132" "213" "231" "312" "321"
 * <p>
 * Given n and k, return the kth permutation sequence.
 * <p>
 * Note: Given n will be between 1 and 9 inclusive.
 */
public class PermutationSequence {

  public String getPermutation(int n, int k) {
    long f = factorial(n);
    if (k < 1 || k > f) {
      throw new IllegalArgumentException();
    }
    k--;
    f /= n;
    List<Integer> numbers = new LinkedList<Integer>();
    for (int i = 1; i <= n; i++) {
      numbers.add(i);
    }
    String output = "";
    for (int i = n; i > 1; i--) {
      int devide = (int) (k / f);
      output += numbers.get(devide);
      numbers.remove(devide);
      k = (int) (k % f);
      f /= (i - 1);
    }
    output += numbers.get(0);
    return output;
  }

  private long factorial(int n) {
    long f = n;
    while (n != 1) {
      n--;
      f *= n;
    }
    return f;
  }
}
