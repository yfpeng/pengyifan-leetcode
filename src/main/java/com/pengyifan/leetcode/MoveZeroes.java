package com.pengyifan.leetcode;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the
 * relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3,
 * 12, 0, 0].
 * <p>
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int begin = 0;
    int i = 0;

    while (i < nums.length) {
      if (nums[i] == 0) {
        i++;
      } else {
        nums[begin] = nums[i];
        begin++;
        i++;
      }
    }

    while (begin < nums.length) {
      nums[begin] = 0;
      begin++;
    }
  }
}
