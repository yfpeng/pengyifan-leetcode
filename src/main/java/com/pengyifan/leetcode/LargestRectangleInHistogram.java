package com.pengyifan.leetcode;

/**
 * Given n non-negative integers representing the histogram's bar height where
 * the width of each bar is 1, find the area of largest rectangle in the
 * histogram.
 */
public class LargestRectangleInHistogram {

  public int largestRectangleArea(int[] height) {
    if (height == null || height.length == 0) {
      return 0;
    }
    int max = 0;
    int i = 0;
    int[] stack = new int[height.length];
    int top = 0;
    while (i < height.length) {
      if (top == 0 || height[stack[top - 1]] <= height[i]) {
        stack[top] = i;
        top++;
        i++;
      } else {
        int left = stack[top - 1];
        top--;
        int area = height[left] * (top == 0 ? i : i - stack[top - 1] - 1);
        if (max < area) {
          max = area;
        }
      }
    }
    while (top != 0) {
      int left = stack[top - 1];
      top--;
      int area = height[left] * (top == 0 ? i : i - stack[top - 1] - 1);
      if (max < area) {
        max = area;
      }
    }
    return max;
  }
}
