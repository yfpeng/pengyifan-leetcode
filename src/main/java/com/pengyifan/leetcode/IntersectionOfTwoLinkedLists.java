package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p>
 * <p>
 * For example, the following two linked lists:
 * <pre>
 * A:          a1 → a2
 *                    ↘
 *                     c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * </pre>
 * begin to intersect at node c1.
 *
 * <p>
 * Notes:
 * <ul>
 * <li>If the two linked lists have no intersection at all, return null.</li>
 * <li>The linked lists must retain their original structure after the function returns.</li>
 * <li>You may assume there are no cycles anywhere in the entire linked structure.</li>
 * <li>Your code should preferably run in O(n) time and use only O(1) memory.</li>
 * </ul>
 */
public class IntersectionOfTwoLinkedLists {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
    int sizeA = size(headA);
    int sizeB = size(headB);
    if (sizeA > sizeB) {
      headA = move(headA, sizeA - sizeB);
    } else {
      headB = move(headB, sizeB - sizeA);
    }
    while (headA != null) {
      if (headA == headB) {
        return headA;
      } else {
        headA = headA.next;
        headB = headB.next;
      }
    }
    return null;
  }

  private ListNode move(ListNode head, int step) {
    for (int i = 0; i < step; i++) {
      head = head.next;
    }
    return head;
  }

  private int size(ListNode head) {
    int i = 0;
    while (head != null) {
      i++;
      head = head.next;
    }
    return i;
  }
}
