package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductOfWordLengthsTest {

  private MaximumProductOfWordLengths t = new MaximumProductOfWordLengths();

  @Test
  public void testMaxProduct() throws Exception {
    assertEquals(16, t.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
    assertEquals(4, t.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
    assertEquals(0, t.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));

    assertEquals(84, t.maxProduct(new String[]{"fcecec", "dadeaffdafb", "ecdafdedaecfdbdeebe",
        "baadbfbaf", "eafbffbcfcdaafd", "faedbfdfd", "aadaeffaecccbbbfd", "debeaacdffcba", "cab",
        "ebfa", "cfeaadadadbe", "dddccfceaddaffebb", "bcacdcbbcefedd", "dddafcc",
        "bcdbafffaedeafefdebb", "beccfeefcbf", "be", "bfdddbafdfaeceeff", "bcddcfbddbafaea",
        "adfacbeaf", "aeafaacaebceb", "fdaabdcbcceffeefaadac", "efbefbf", "dfbcabeebfd", "ddabbcd",
        "adbddfcfbfeebfbfefadb", "ccefcb", "ecdefdacfbfef", "aecbbaaea", "abbbdadfddeebb",
        "eefcabdbedd", "affffbbdafd", "ecae", "bcccaafa", "bafbe", "fdfadccaaabedeceef",
        "baeafebcacd", "bcebcfebccbdafabfabb", "badaadffcabfdcce", "cfcfcccccfd",
        "fdfcbdebbecdbbcbb", "ecfed", "ebf", "baaefbedbdc", "aabcfebbffaddfbbcfc", "edfabaeddbc",
        "ccbedbaefceebd", "ccbdeeabddfffcbfba", "aababccbcaf", "dadfbb", "acfaaa", "bbb",
        "ecebecbfedaeaaefbecb", "eaa", "bcafdedbdbbe", "beafbcbe", "bffaeefbccbd", "bdd", "fbeced",
        "bdabfdeeabcbdeaaece", "eaabacfddebd", "bfdeedbfeadfcfafbdca", "cafeecdbdcdffea",
        "dadcdccfdba", "bfefbcbbb", "dbdac", "cedbeacfebbaafe", "ebfbdaf", "dbcdafabdea", "affbb",
        "daceecfbfceafcafcfbec", "fceaedfccdcaf", "dcecfad", "babccccacaaddfaa", "cef", "cef",
        "edaceafedb", "bdcdaadecfdfff", "dbfda", "bedecbeabfdfd", "facedddc", "ffebdfbbafdeedefbcc",
        "cdacaefebeadfbbadfbc", "cfccbd", "eeccbeadfeac", "bbeadcdedcfffcfdfdb",
        "bcccdefcfdaadafee", "ddcdffbdccfabcddad", "aadbfcfffbbcbbebce", "cbacbeb",
        "fcaecbffdadcaadc", "cfcdad", "cdbaadddfedbb", "abbbffebcdadd", "bdeffaeeffcdaeae", "abef",
        "bbacfefbfacfd", "ecdb", "fefda", "fdede", "bea", "acaadebbbfcdaaed", "baebcedacfec",
        "cbde", "bffcbffffff", "aeefbaa", "cebbcefbdcf", "febddedceaeabfbdeecef", "ab", "ceedadfd",
        "afabbddabcafb", "aaadaefdf", "eaaebbdbadbdcacdfbf", "aaeedbc", "fddcbcbcfdfdcccd", "cf",
        "bd", "dadfdaeaccaeceeccafdc", "ccfcdccfa", "cceeefedcdeedcdb", "babaeffcc", "fcbdf", "dd",
        "caaabdbfadefcea", "cfeeeccebbdabb", "ccebafccdcddfcbf", "eadff", "fdfdbaaefbcab",
        "cebacbfdcaaaaaeb", "becdf", "bcddffaddbdacfcddec", "aacdacfbf", "aecbee", "efeeeca",
        "aebafabcbacbfcbef", "fccacdcafdeebd", "eedbeeaccdeaecbbeee", "dcaebbbadfafcfdcacd",
        "decffacf", "cafbe", "ce", "ea", "efbfccfad", "ccdccdaccdaaaffffec", "adbedcabcdb",
        "dccdbdedcdbc", "dbfeeacbd", "ef", "aedcfcedbcbac", "bebe", "acccadefdffaaaacddddb",
        "beebcfacdcfbbadafacd", "ecffde", "dffd", "cdfdfd", "ececadfcaebc", "acaacccabce",
        "fa", "afccecdd", "fabbfcccbcccbe", "eea", "bddceccceaeac", "cadfbadedde",
        "ecdbdbfccadfbadeebe", "fbbad", "cfdefaadbefcdbec", "bdbde", "bbbb", "addadbfaaeaaaeceb",
        "aeebfadccbfdabfebb", "aedafbbceeaefe", "aaeeeeacacefabd", "fcacedafbfcfe",
        "abdecbfccdebdbbfe", "ad", "ddbdadafdb", "dbdccaaddbbdedbacdbae", "ffecfddbafbdefdee",
        "cfadb", "adbecfaae", "ccfdccdebdeadffeb", "bedf", "cc", "deaabfdcadedecfdecdae",
        "acfbddcbbfecab", "bbebcdbc", "bbcdbccbebdcbdc", "cceaca", "ecbebfeacecba",
        "ecceebadffabcdefaee", "fcddcebdcdcdabfeba", "ef", "defaceacdda", "bfccbe", "bbdcdeecbddf",
        "cdbeabadfffcfcadbfa", "abbfbaeaaedfbbfbbabfa", "eeebcbbfcbdafdb", "bfdadaeecaebb",
        "dcdadca", "dcddffaeaebebcddcaee", "afeebecccbded", "caacffdbb", "ebb",
        "cbdebebfdcaeaaeececbf", "ffafbafadfeffbbefaf", "cae", "afbaefefae", "ddfbaeac",
        "afffbffddded", "bbecafadecebe", "dfecfadb", "ecfbcadcacfebba", "dcaccebcffadffbcff",
        "bbafebcdadbe", "facbbefcdbc", "bff", "dfdebefdfadbbfdddace", "bbab",
        "afdcbdeceacccabeaddcc", "fedbcedc", "fcfcaffdebfade", "caacbece", "ccafdbdabedeaceecd",
        "acedf", "fbfcdffcddfdaaafaceb", "ba", "eeedacfceacaafddcd", "bffababeba", "bccdbfbe",
        "dcdaeeebf", "efcadfaf", "dfdfe", "aa", "eadadbbccdbfedcef", "bfabefaddbedaedbafab",
        "fabfdfbacbeeabae", "ddf", "edbacacdedef", "dcafccfbaeb", "dbb", "dbaecdbdcfddfbd", "afb",
        "aebfadcefaddee", "fdd", "daa", "bdeebaefbbbfedaffef", "cfddbadecaecfccae",
        "aeefdbfefbeccbe", "ddaebcff"}));
  }
}