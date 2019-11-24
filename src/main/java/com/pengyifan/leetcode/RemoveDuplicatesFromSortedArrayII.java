package com.pengyifan.leetcode;

/**
 * Follow up for "Remove Duplicates": What if duplicates are allowed at most
 * twice?
 * <p>
 * For example, Given sorted array A = [1,1,1,2,2,3],
 * <p>
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 */
public class RemoveDuplicatesFromSortedArrayII {

  public int removeDuplicates(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int length = 1;
    int count = 1;
    for (int i = 1; i < A.length; i++) {
      if (A[i] != A[i - 1]) {
        count = 1;
        A[length] = A[i];
        length++;
      } else if (count < 2) {
        count++;
        A[length] = A[i];
        length++;
      }
    }
    return length;
  }
}
