package com.pengyifan.leetcode;

import java.util.Stack;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two
 * endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together
 * with x-axis forms a container, such that the container contains the most
 * water.
 * <p>
 * Note: You may not slant the container.
 */
public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    if (height == null || height.length <= 1) {
      return 0;
    }
    int maxContainer = 0;
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(0);
    int index = 1;
    while (index < height.length) {
      if (stack.size() == 1 || height[stack.peek()] <= height[index]) {
        stack.push(index);
        index++;
      } else if (stack.size() == 1) {
        int area = index * Math.min(height[index], height[0]);
        if (maxContainer < area) {
          maxContainer = area;
        }
        index++;
      } else {
        int left = stack.pop();
        int area = (index - stack.peek()) * height[left];
        if (maxContainer < area) {
          maxContainer = area;
        }
      }
    }
    index--;
    int lastHeight = stack.pop();
    while (!stack.isEmpty()) {
      int left = stack.pop();
      int area = 0;
      if (stack.isEmpty()) {
        area = index * Math.min(lastHeight, height[0]);
      } else {
        area = (index - stack.peek()) * height[left];
      }
      if (maxContainer < area) {
        maxContainer = area;
      }
    }
    return maxContainer;
  }
}
