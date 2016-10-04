package com.pengyifan.leetcode;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * <p>
 * Output: index1=1, index2=2
 */
public class TwoSumII {
  public int[] twoSum(int[] numbers, int target) {
    if (numbers == null || numbers.length == 0) {
      return null;
    }
    for (int index1 = 0; index1 < numbers.length; index1++) {
      int index2 = twoSumHelper(numbers, target, index1, index1 + 1, numbers.length - 1);
      if (index2 != -1) {
        return new int[]{index1 + 1, index2 + 1};
      }
    }
    return null;
  }

  private int twoSumHelper(int[] numbers, int target, int index1, int low, int high) {
    if (high < low) {
      return -1;
    }
    int mid = (low + high) / 2;
    if (numbers[index1] + numbers[mid] == target) {
      return mid;
    } else if (numbers[index1] + numbers[mid] < target) {
      return twoSumHelper(numbers, target, index1, mid + 1, high);
    } else {
      return twoSumHelper(numbers, target, index1, low, mid - 1);
    }
  }
}
