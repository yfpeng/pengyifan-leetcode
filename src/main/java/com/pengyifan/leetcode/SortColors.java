package com.pengyifan.leetcode;

/**
 * Given an array with n objects colored red, white or blue, sort them so that
 * objects of the same color are adjacent, with the colors in the order red,
 * white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red,
 * white, and blue respectively.
 * <p>
 * Note:
 * <p>
 * You are not suppose to use the library's sort function for this problem.
 * <p>
 * Follow up:
 * <p>
 * A rather straight forward solution is a two-pass algorithm using counting
 * sort.
 * <p>
 * First, iterate the array counting number of 0's, 1's, and 2's, then
 * overwrite array with total number of 0's, then 1's and followed by 2's.
 * <p>
 * Could you come up with an one-pass algorithm using only constant space?
 */
public class SortColors {

  public void sortColors(int[] A) {
    if (A == null || A.length == 0) {
      return;
    }

    int redi = 0;
    int bluei = A.length - 1;
    while (redi < A.length && A[redi] == 0) {
      redi++;
    }
    while (bluei >= 0 && A[bluei] == 2) {
      bluei--;
    }
    int whitei = redi;
    while (whitei <= bluei) {
      if (A[whitei] == 0 && whitei > redi) {
        swap(A, redi, whitei);
        redi++;
      } else if (A[whitei] == 2) {
        swap(A, bluei, whitei);
        bluei--;
      } else {
        whitei++;
      }
    }
  }

  private void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  public void sortColorsTwoPass(int[] A) {

    if (A == null || A.length == 0) {
      return;
    }

    int redi = 0;
    int whii = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == 0) {
        redi++;
      } else if (A[i] == 1) {
        whii++;
      }
    }
    for (int i = 0; i < redi; i++) {
      A[i] = 0;
    }
    for (int i = redi; i < redi + whii; i++) {
      A[i] = 1;
    }
    for (int i = redi + whii; i < A.length; i++) {
      A[i] = 2;
    }
  }
}
