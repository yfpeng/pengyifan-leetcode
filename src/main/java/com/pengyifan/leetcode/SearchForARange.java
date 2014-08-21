package com.pengyifan.leetcode;

/**
 * Given a sorted array of integers, find the starting and ending position of a
 * given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 */
public class SearchForARange {

  public int[] searchRange(int[] A, int target) {
    int begin = -1;
    int end = -1;
    if (A == null || A.length == 0) {
      ;
    } else if (A.length == 1) {
      if (A[0] == target) {
        begin = end = 0;
      }
    } else if (A.length == 2) {
      if (A[0] == target) {
        begin = 0;
        end = 0;
      }
      if (A[1] == target) {
        end = 1;
        if (begin == -1) {
          begin = 1;
        }
      }
    } else {
      begin = searchRangeBegin(A, target, 0, A.length - 1);
      end = searchRangeEnd(A, target, 0, A.length - 1);
    }
    return new int[] { begin, end };
  }

  // [start, end]
  private int searchRangeEnd(int[] A, int target, int start, int end) {
    if (start > end || end > A.length || start < 0) {
      return -1;
    }
    if (start == end) {
      if (A[start] == target) {
        return start;
      } else {
        return -1;
      }
    }
    if (end - start == 1) {
      if (A[end] == target) {
        return end;
      } else if (A[start] == target) {
        return start;
      } else {
        return -1;
      }
    }
    int mid = (start + end) / 2;
    if (A[mid] == target) {
      // search [mid, end]
      return searchRangeEnd(A, target, mid, end);
    } else if (A[mid] > target) {
      // search [start, mid)
      return searchRangeEnd(A, target, start, mid - 1);
    } else {
      // search (mid, end]
      return searchRangeEnd(A, target, mid + 1, end);
    }
  }

  // [start, end]
  private int searchRangeBegin(int[] A, int target, int start, int end) {
    if (start > end || end > A.length || start < 0) {
      return -1;
    }
    if (start == end) {
      if (A[start] == target) {
        return start;
      } else {
        return -1;
      }
    }
    if (end - start == 1) {
      if (A[start] == target) {
        return start;
      } else if (A[end] == target) {
        return end;
      } else {
        return -1;
      }
    }
    int mid = (start + end) / 2;
    if (A[mid] == target) {
      // search [start, mid]
      return searchRangeBegin(A, target, start, mid);
    } else if (A[mid] > target) {
      // search [start, mid)
      return searchRangeBegin(A, target, start, mid - 1);
    } else {
      // search (mid, end]
      return searchRangeBegin(A, target, mid + 1, end);
    }
  }
}
