package com.pengyifan.leetcode;

/**
 * Given a non-negative number represented as an array of digits, plus one to
 * the number.
 * <p>
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 */
public class PlusOne {

  public int[] plusOne(int[] digits) {
    if (digits == null || digits.length == 0) {
      return digits;
    }
    int carry = 1;
    int i = digits.length - 1;
    while (carry != 0 && i >= 0) {
      digits[i] += carry;
      if (digits[i] < 10) {
        carry = 0;
        break;
      }
      digits[i] %= 10;
      i--;
    }
    // add one digit
    if (carry == 1) {
      int tmp[] = new int[digits.length + 1];
      System.arraycopy(digits, 0, tmp, 1, digits.length);
      tmp[0] = 1;
      digits = tmp;
    }
    return digits;
  }
}
