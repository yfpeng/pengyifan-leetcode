package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

  LongestPalindrome t = new LongestPalindrome();
  @Test
  public void testLongestPalindrome() throws Exception {
    assertEquals(7, t.longestPalindrome("abccccdd"));
    assertEquals(983, t.longestPalindrome(
        "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendure" +
            "WeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfield" +
            "asafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisalt" +
            "ogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannot" +
            "consecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehave" +
            "consecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenor" +
            "longrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingra" +
            "thertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonob" +
            "lyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthat" +
            "fromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpf" +
            "ullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvaint" +
            "hatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeopleby" +
            "thepeopleforthepeopleshallnotperishfromtheearth"));
  }
}