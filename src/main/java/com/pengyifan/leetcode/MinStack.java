package com.pengyifan.leetcode;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant
 * time.
 * <ul>
 * <li>push(x) -- Push element x onto stack.</li>
 * <li>pop() -- Removes the element on top of the stack.</li>
 * <li>top() -- Get the top element.</li>
 * <li>getMin() -- Retrieve the minimum element in the stack.</li>
 * </ul>
 * Example:
 * <pre>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * </pre>
 */
public class MinStack {

  private Stack<Pair> s;

  /**
   * initialize your data structure here.
   */
  public MinStack() {
    s = new Stack<>();
  }

  public void push(int x) {
    if (s.isEmpty()) {
      s.push(new Pair(x, x));
    } else {
      s.push(new Pair(x, Math.min(x, s.peek().min)));
    }
  }

  public void pop() {
    s.pop();
  }

  public int top() {
    return s.peek().val;
  }

  public int getMin() {
    return s.peek().min;
  }

  private class Pair {
    int val;
    int min;

    public Pair(int val, int min) {
      this.val = val;
      this.min = min;
    }
  }
}
