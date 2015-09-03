package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to
 * that node.
 * <p>
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the
 * linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeInALinkedList {
  public void deleteNode(ListNode node) {
    if (node.next == null) {
      return;
    }
    if (node.next.next == null) {
      node.val = node.next.val;
      node.next = null;
      return;
    }
    ListNode next = node.next;
    while (next.next != null) {
      node.val = next.val;
      node = next;
      next = next.next;
    }
    node.val = next.val;
    node.next = null;
  }
}
