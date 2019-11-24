package com.pengyifan.leetcode;

import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * <p>
 * <ul>
 * <li>push(x) -- Push element x to the back of queue.</li>
 * <li>pop() -- Removes the element from in front of queue.</li>
 * <li>peek() -- Get the front element.</li>
 * <li>empty() -- Return whether the queue is empty.</li>
 * </ul>
 * Notes:
 * <ul>
 * <li>You must use only standard operations of a stack -- which means only push to top, peek/pop
 * from
 * top, size, and is empty operations are valid.</li>
 * <li>Depending on your language, stack may not be supported natively. You may simulate a stack by
 * using a list or deque (double-ended queue), as long as you use only standard operations of a
 * stack.</li>
 * <li>You may assume that all operations are valid (for example, no pop or peek operations will be
 * called on an empty queue).</li>
 * </ul>
 */
public class ImplementQueueUsingStacks {

  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  // Push element x to the back of queue.
  public void push(int x) {
    stack1.push(x);
  }

  // Removes the element from in front of queue.
  public void pop() {
    if (!stack2.isEmpty()) {
      stack2.pop();
    } else if (!stack1.isEmpty()) {
      moveStack1ToStack2();
      stack2.pop();
    } else {
      ;
    }
  }

  // Get the front element.
  public int peek() {
    if (!stack2.isEmpty()) {
      return stack2.peek();
    } else if (!stack1.isEmpty()) {
      moveStack1ToStack2();
      return stack2.peek();
    } else {
      return -1;
    }
  }

  // Return whether the queue is empty.
  public boolean empty() {
    return stack1.isEmpty() && stack2.isEmpty();
  }

  private void moveStack1ToStack2() {
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
  }
}
