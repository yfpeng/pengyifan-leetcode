package com.pengyifan.leetcode;

/**
 * Array balance point. Find, if possible, an index in the array such that the
 * sum of all integers to left of the index is equal to the sum of all the
 * integers right of the index. e.g.
 * 
 * <pre>
 * balancePoint([5, 4, 0, 19, 3, 4, 2, 0]) = 3
 * balancePoint([5, 4, 2, 1]) = -1
 * balancePoint([5, 4, 0, 3, 4, 2, 0]) = 2
 * </pre>
 */
public class ArrayBalancePoint {

  public int balancePoint(int[] array) {
    if (array == null || array.length == 0) {
      return -1;
    }

    int sum = 0;
    for (int i : array) {
      sum += i;
    }

    int bp = -1;
    int leftSum = 0;
    for (int i = 0; i < array.length - 2; i++) {
      leftSum += array[i];
      if (leftSum == (sum - array[i + 1]) / 2) {
        if (bp == -1) {
          bp = i + 1;
        } else {
          return -1;
        }
      }
    }
    return bp;
  }
}
