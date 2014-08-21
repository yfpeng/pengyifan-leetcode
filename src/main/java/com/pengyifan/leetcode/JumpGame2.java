package com.pengyifan.leetcode;

import java.util.Arrays;

/**
 * Given an array of non-negative integers, you are initially positioned at the
 * first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that
 * position.
 * <p>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * For example: Given array A = [2,3,1,1,4]
 * <p>
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from
 * index 0 to 1, then 3 steps to the last index.)
 */
public class JumpGame2 {

  public int jump(int[] A) {
    if (A == null || A.length == 0 || A.length == 1) {
      return 0;
    }

    int[] maxSteps = new int[A.length];
    Arrays.fill(maxSteps, Integer.MAX_VALUE);

    maxSteps[0] = 0;
    int index = 0;
    while (index < A.length) {
      for (int j = index + 1; j <= index + A[index] && j < A.length; j++) {
        maxSteps[j] = Math.min(maxSteps[j], maxSteps[index] + 1);
      }
      // find next
      int nextIndex = index + 1;
      if (nextIndex >= A.length) {
        break;
      }
      int maxNext = A[nextIndex] + nextIndex;
      for (int j = nextIndex; j <= index + A[index] && j < A.length; j++) {
        if (maxNext < j + A[j]) {
          maxNext = j + A[j];
          nextIndex = j;
        }
      }
      index = nextIndex;
    }
    return maxSteps[A.length - 1];
  }
}
