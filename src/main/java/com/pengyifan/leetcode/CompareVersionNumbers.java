package com.pengyifan.leetcode;

/**
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * <p>
 * You may assume that the version strings are non-empty and contain only digits and the .
 * character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth
 * second-level revision of the second first-level revision.
 * <p>
 * Here is an example of version numbers ordering:
 * <p>
 * 0.1 < 1.1 < 1.2 < 13.37
 */
public class CompareVersionNumbers {
  public int compareVersion(String version1, String version2) {
    if (version1 == null && version2 == null) {
      return 0;
    } else if (version1 == null) {
      return 1;
    } else if (version2 == null) {
      return -1;
    }

    if (version1.isEmpty() && version2.isEmpty()) {
      return 0;
    } else if (version1.isEmpty()) {
      return 1;
    } else if (version2.isEmpty()) {
      return -1;
    }

    String[] toks1 = version1.split("[.]");
    String[] toks2 = version2.split("[.]");
    int i = 0;
    while (i < toks1.length && i < toks2.length) {
      int i1 = Integer.parseInt(toks1[i]);
      int i2 = Integer.parseInt(toks2[i]);
      int c = Integer.compare(i1, i2);
      if (c != 0) {
        return c;
      }
      i++;
    }


    if (toks1.length < toks2.length) {
      if (isAllZeros(toks2, i)) {
        return 0;
      } else {
        return -1;
      }
    } else if (toks1.length > toks2.length) {
      if (isAllZeros(toks1, i)) {
        return 0;
      } else {
        return 1;
      }
    } else {
      return 0;
    }
  }

  private boolean isAllZeros(String[] toks, int i) {
    while (i < toks.length) {
      int i2 = Integer.parseInt(toks[i]);
      if (i2 != 0) {
        return false;
      }
      i++;
    }
    return true;
  }
}
