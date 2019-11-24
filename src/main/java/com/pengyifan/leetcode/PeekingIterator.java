package com.pengyifan.leetcode;

import java.util.Iterator;

/**
 * Given an Iterator class interface with methods: next() and hasNext(), design and implement a
 * PeekingIterator that support the peek() operation -- it essentially peek() at the element that
 * will be returned by the next call to next().
 * <p>
 * Here is an example. Assume that the iterator is initialized to the beginning of the list: [1, 2,
 * 3].
 * <p>
 * Call next() gets you 1, the first element in the list.
 * <p>
 * Now you call peek() and it returns 2, the next element. Calling next() after that still return
 * 2.
 * <p>
 * You call next() the final time and it returns 3, the last element. Calling hasNext() after that
 * should return false.
 */
public class PeekingIterator implements Iterator<Integer> {

  private Integer next;
  private Iterator<Integer> iterator;

  public PeekingIterator(Iterator<Integer> iterator) {
    // initialize any member here.
    this.iterator = iterator;
    if (iterator.hasNext()) {
      next = iterator.next();
    } else {
      next = null;
    }
  }

  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    return next;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    int tmp = next;
    if (iterator.hasNext()) {
      next = iterator.next();
    } else {
      next = null;
    }
    return tmp;
  }

  @Override
  public boolean hasNext() {
    return next != null;
  }
}