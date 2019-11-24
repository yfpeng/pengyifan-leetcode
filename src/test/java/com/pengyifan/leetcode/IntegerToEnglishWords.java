package com.pengyifan.leetcode;

/**
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to
 * be less than 231 - 1.
 * <p>
 * For example,
 * <pre>
 * 123 -> "One Hundred Twenty Three"
 * 12345 -> "Twelve Thousand Three Hundred Forty Five"
 * 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 * </pre>
 */
public class IntegerToEnglishWords {
  public String numberToWords(int num) {
    if (num == 0) {
      return "Zero";
    } else {
      return numberToWordsHelper(num).trim().replaceAll("[ ]+", " ");
    }
  }

  private String numberToWordsHelper(int num) {
    if (num == 0) {
      return "";
    } else if (num < 10) {
      return oneDigit(num);
    } else if (num < 100) {
      return twoDigit(num);
    } else if (num < 1000) {
      return numberToWordsHelper(num / 100) + " Hundred " + numberToWordsHelper(num % 100);
    } else if (num < 1000000) {
      return numberToWordsHelper(num / 1000) + " Thousand " + numberToWordsHelper(num % 1000);
    } else if (num < 1000000000) {
      return numberToWordsHelper(num / 1000000) + " Million " + numberToWordsHelper(num % 1000000);
    } else {
      return numberToWordsHelper(num / 1000000000) + " Billion " + numberToWordsHelper(num % 1000000000);
    }
  }

  public String twoDigit(int num) {
    switch (num) {
    case 10:
      return "Ten";
    case 11:
      return "Eleven";
    case 12:
      return "Twelve";
    case 13:
      return "Thirteen";
    case 14:
      return "Fourteen";
    case 15:
      return "Fifteen";
    case 16:
      return "Sixteen";
    case 17:
      return "Seventeen";
    case 18:
      return "Eighteen";
    case 19:
      return "Nineteen";
    case 20:
      return "Twenty";
    case 30:
      return "Thirty";
    case 40:
      return "Forty";
    case 50:
      return "Fifty";
    case 60:
      return "Sixty";
    case 70:
      return "Seventy";
    case 80:
      return "Eighty";
    case 90:
      return "Ninety";
    }
    return twoDigit(num / 10 * 10) + " " + oneDigit(num % 10);
  }

  public String oneDigit(int num) {
    switch (num) {
    case 1:
      return "One";
    case 2:
      return "Two";
    case 3:
      return "Three";
    case 4:
      return "Four";
    case 5:
      return "Five";
    case 6:
      return "Six";
    case 7:
      return "Seven";
    case 8:
      return "Eight";
    case 9:
      return "Nine";
    default:
      return "";
    }
  }
}
