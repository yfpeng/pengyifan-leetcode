package com.pengyifan.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement the following operations of a stack using queues.
 * <p>
 * <ul>
 * <li>push(x) -- Push element x onto stack.</li>
 * <li>pop() -- Removes the element on top of the stack.</li>
 * <li>top() -- Get the top element.</li>
 * <li>empty() -- Return whether the stack is empty.</li>
 * </ul>
 * Notes:
 * <ul>
 * Y<li>ou must use only standard operations of a queue -- which means only push to back, peek/pop from
 * front, size, and is empty operations are valid.</li>
 * <li>Depending on your language, queue may not be supported natively. You may simulate a queue by
 * using a list or deque (double-ended queue), as long as you use only standard operations of a
 * queue.</li>
 * <li>You may assume that all operations are valid (for example, no pop or top operations will be
 * called on an empty stack).</li>
 * </ul>
 */
public class ImplementStackUsingQueues {

  private Queue<Integer> q1 = new LinkedList<>();
  private Queue<Integer> q2 = new LinkedList<>();

  // Push element x onto stack.
  public void push(int x) {
    q2.offer(x);
    while (!q1.isEmpty()) {
      q2.offer(q1.poll());
    }
    while (!q2.isEmpty()) {
      q1.offer(q2.poll());
    }
  }

  // Removes the element on top of the stack.
  public void pop() {
    if (!q1.isEmpty()) {
      q1.poll();
    } else {
      ;
    }
  }

  // Get the top element.
  public int top() {
    if (!q1.isEmpty()) {
      return q1.peek();
    } else {
      return -1;
    }
  }

  // Return whether the stack is empty.
  public boolean empty() {
    return q1.isEmpty();
  }
}
