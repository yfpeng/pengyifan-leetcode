package com.pengyifan.leetcode;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * <p>
 * Note:
 * <p>
 * You may assume that A has enough space (size that is greater or equal to m +
 * n) to hold additional elements from B. The number of elements initialized in
 * A and B are m and n respectively.
 */
public class MergeSortedArray {

  public void merge(int A[], int m, int B[], int n) {
    if (m < 0 || n < 0) {
      return;
    }
    if (m == 0 && n == 0) {
      return;
    }
    if (n == 0) {
      return;
    }
    if (m == 0) {
      System.arraycopy(B, 0, A, 0, n);
    }
    int indexA = m - 1;
    int indexB = n - 1;
    int totalIndex = m + n - 1;
    while (indexA >= 0 && indexB >= 0) {
      if (A[indexA] >= B[indexB]) {
        A[totalIndex] = A[indexA];
        indexA--;
      } else {
        A[totalIndex] = B[indexB];
        indexB--;
      }
      totalIndex--;
    }
    if (indexA < 0) {
      while (indexB >= 0) {
        A[totalIndex] = B[indexB];
        indexB--;
        totalIndex--;
      }
    } else {
      while (indexA >= 0) {
        A[totalIndex] = A[indexA];
        indexA--;
        totalIndex--;
      }
    }
  }
}
