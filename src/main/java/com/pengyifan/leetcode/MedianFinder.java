package com.pengyifan.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is
 * no middle value. So the median is the mean of the two middle value.
 * Examples:
 * <p>
 * [2,3,4] , the median is 3
 * <p>
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * <p>
 * Design a data structure that supports the following two operations:
 * <p>
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 * <p>
 * For example:
 * <pre>
 * add(1)
 * add(2)
 * findMedian() -> 1.5
 * add(3)
 * findMedian() -> 2
 */
public class MedianFinder {

  private PriorityQueue<Integer> lHalf; // return max
  private PriorityQueue<Integer> hHalf; // return min

  public MedianFinder() {
    lHalf = new PriorityQueue<>(10, new Comparator<Integer>() {
      @Override
      public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1);
      }
    });
    hHalf = new PriorityQueue<>(10, new Comparator<Integer>() {
      @Override
      public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
      }
    });
  }


  // Adds a number into the data structure.
  public void addNum(int num) {
    if (lHalf.isEmpty() || lHalf.peek() >= num) {
      lHalf.offer(num);
    } else {
      hHalf.offer(num);
    }

    if (lHalf.size() - hHalf.size() > 1) {
      hHalf.offer(lHalf.poll());
    } else if (hHalf.size() - lHalf.size() > 1) {
      lHalf.offer(hHalf.poll());
    }
  }

  // Returns the median of current data stream
  public double findMedian() {
    if (lHalf.isEmpty() || hHalf.size() > lHalf.size()) {
      return hHalf.peek();
    } else if (hHalf.isEmpty() || lHalf.size() > hHalf.size()) {
      return lHalf.peek();
    } else {
      return (lHalf.peek() + hHalf.peek()) / 2.0;
    }
  }
}
