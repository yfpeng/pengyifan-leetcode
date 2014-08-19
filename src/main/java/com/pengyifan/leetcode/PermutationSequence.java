package com.pengyifan.leetcode;

import java.util.LinkedList;
import java.util.List;

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
      int devide = (int)(k / f);
      output += numbers.get(devide);
      numbers.remove(devide);
      k = (int)(k % f);
      f /= (i-1);
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
