package com.pengyifan.leetcode;

public class MedianOfTwoSortedArrays {

  public double findMedianSortedArrays(int A[], int B[]) {
    if (A == null || B == null) {
      throw new IllegalArgumentException();
    }
    return findMedianSortedArraysHelper(
        A,
        0,
        A.length - 1,
        B,
        0,
        B.length - 1);
  }

  // [startA, endA]
  public double findMedianSortedArraysHelper(int A[], int startA, int endA,
      int B[], int startB, int endB) {
    if (endA - startA > endB - startB) {
      return findMedianSortedArraysHelper(B, startB, endB, A, startA, endA);
    }
    if (endA - startA < 0) {
      return median(B, startB, endB);
    }

    if (endA == startA) {
      int middleB = (startB + endB) / 2;
      if (endB == startB) {
        return median(A[startA], B[startB]);
      } else if ((endB - startB) % 2 == 1) {
        return median(A[startA], B[middleB], B[middleB + 1]);
      } else {
        return median(A[startA], B[middleB - 1], B[middleB], B[middleB + 1]);
      }
    }
    if (endA - startA == 1) {
      int middleB = (startB + endB) / 2;
      if (endB - startB == 1) {
        return median(A[startA], A[endA], B[startB], B[endB]);
      } else if ((endB - startB) % 2 == 1) {
        return median(
            B[middleB],
            B[middleB + 1],
            Math.max(A[startA], B[middleB - 1]),
            Math.min(A[endA], B[middleB + 2]));
      } else {
        return median(
            B[middleB],
            Math.max(A[startA], B[middleB - 1]),
            Math.min(A[endA], B[middleB + 1]));
      }
    }
    int middleA = (startA + endA) / 2;
    int middleB = (startB + endB) / 2;
    int cut = middleA - startA;
    if (A[middleA] < B[middleB]) {
      return findMedianSortedArraysHelper(
          A,
          startA + cut,
          endA,
          B,
          startB,
          endB - cut);
    } else {
      return findMedianSortedArraysHelper(
          A,
          startA,
          endA - cut,
          B,
          startB + cut,
          endB);
    }
  }

  // [start, end]
  private double median(int[] a, int start, int end) {
    int m = (start + end) / 2;
    if ((start - end) % 2 == 0) {
      return a[m];
    } else {
      return median(a[m], a[m + 1]);
    }
  }

  private double median(double a, double b) {
    return (a + b) / 2;
  }

  private double median(int a, int b, int c) {
    return (a + b + c)
        - Math.max(a, Math.max(b, c))
        - Math.min(a, Math.min(b, c));
  }

  private double median(int a, int b, int c, int d) {
    return (a + b + c + d - Math.max(Math.max(a, b), Math.max(c, d)) - Math
        .min(Math.min(a, b), Math.min(c, d))) / 2.0;
  }
}
