package com.pengyifan.leetcode;

public class SearchInsertPosition {

  public int searchInsert(int[] A, int target) {
    if (A == null) {
      throw new NullPointerException();
    }
    if (A.length == 0) {
      return 0;
    }
    return searchInsertHelper(A, target, 0, A.length);
  }

  private int searchInsertHelper(int[] A, int target, int start, int end) {
    if (start == end) {
      return start;
    }
    int mid = (start + end) / 2;
    if (A[mid] == target) {
      return mid;
    } else if (A[mid] < target) {
      return searchInsertHelper(A, target, mid + 1, end);
    } else {
      return searchInsertHelper(A, target, start, mid);
    }
  }
}
