package com.pengyifan.leetcode;

/**
 * Rotate an array of n elements to the right by k steps.
 * <p>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
  public void rotate(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
      return;
    }
    k = k % nums.length;

    int[] copy = new int[nums.length];
    int i = 0;
    int j = nums.length - k;
    while (j < nums.length) {
      copy[i] = nums[j];
      i++;
      j++;
    }

    j = 0;
    while (j < nums.length - k) {
      copy[i] = nums[j];
      i++;
      j++;
    }

    for (i = 0; i < nums.length; i++) {
      nums[i] = copy[i];
    }
  }
}
