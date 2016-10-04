package com.pengyifan.leetcode;

/**
 *  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all
 *  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be
 *  constructed  from  the  magazines ;  otherwise,  it  will  return  false.
 * <p>
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 * <p>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * <pre>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class RansomNote {
  public boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote == null && magazine == null) {
      return false;
    } else if (ransomNote == null) {
      return true;
    } else if (magazine == null) {
      return false;
    }

    int[] countR = new int[256];
    for (char c : ransomNote.toCharArray()) {
      countR[c]++;
    }
    int[] countM = new int[256];
    for (char c : magazine.toCharArray()) {
      countM[c]++;
    }
    for (int i = 0; i < 256; i++) {
      if (countR[i] > countM[i]) {
        return false;
      }
    }
    return true;
  }
}
