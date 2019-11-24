package com.pengyifan.leetcode;

/**
 * Find the contiguous subAay within an Aay (containing at least one number)
 * which has the largest product.
 * <p>
 * For example, given the Aay [2,3,-2,4], the contiguous subAay [2,3] has the
 * largest product = 6.
 * <p>
 * Note:
 * Should have better solution
 */
public class MaximumProductSubarray {

  public int maxProduct(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int n = removeOne(A, A.length);
    n = removeMinusOne(A, n);
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int prod = 1;
      for (int j = i; j >= 0; j--) {
        prod *= A[j];
        if (max < prod) {
          max = prod;
        }
        if (A[j] == 0) {
          break;
        }
      }
    }
    return max;
  }

  private int removeMinusOne(int[] A, int n) {
    int length = 0;
    for (int i = 0; i < n - 1; i++) {
      if (A[i] == -1 && A[i + 1] == -1) {
        i++;
      } else {
        A[length] = A[i];
        length++;
      }
    }
    A[length] = A[n - 1];
    length++;
    if (length < n) {
      A[length] = 1;
      length++;
    }
    return length;
  }

  private int removeOne(int[] A, int n) {
    int length = 0;
    for (int i = 0; i < n; i++) {
      if (A[i] != 1) {
        A[length] = A[i];
        length++;
      }
    }
    if (length < n) {
      A[length] = 1;
      length++;
    }
    return length;
  }
}
