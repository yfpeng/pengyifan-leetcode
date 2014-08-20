package com.pengyifan.leetcode;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class WordLadder2Test {

  WordLadder2 t = new WordLadder2();

  @Test
  public void testFindLadders() {
    Set<String> dict = new HashSet<String>();
    dict.add("hot");
    dict.add("dot");
    dict.add("dog");
    dict.add("lot");
    dict.add("log");
    List<List<String>> totalList = t.findLadders("hit", "cog", dict);
    assertThat(
        totalList,
        hasItem(Arrays.asList("hit", "hot", "dot", "dog", "cog")));
    assertThat(
        totalList,
        hasItem(Arrays.asList("hit", "hot", "lot", "log", "cog")));
  }

  @Test
  public void testFindLadders2() {
    Set<String> dict = new HashSet<String>();
    String[] words = {
        "si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln",
        "tm", "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra",
        "fa", "yo", "ow", "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or",
        "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb",
        "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz",
        "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo",
        "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt", "io",
        "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye"
    };
    for (String word : words) {
      dict.add(word);
    }
    List<List<String>> totalList = t.findLadders("qa", "sq", dict);
    System.out.println(totalList);
  }

  @Test
  public void testFindLadders3() {
    Set<String> dict = new HashSet<String>();
    String[] words = {
        "dose", "ends", "dine", "jars", "prow", "soap", "guns", "hops", "cray",
        "hove", "ella", "hour", "lens", "jive", "wiry", "earl", "mara", "part",
        "flue", "putt", "rory", "bull", "york", "ruts", "lily", "vamp", "bask",
        "peer", "boat", "dens", "lyre", "jets", "wide", "rile", "boos", "down",
        "path", "onyx", "mows", "toke", "soto", "dork", "nape", "mans", "loin",
        "jots", "male", "sits", "minn", "sale", "pets", "hugo", "woke", "suds",
        "rugs", "vole", "warp", "mite", "pews", "lips", "pals", "nigh", "sulk",
        "vice", "clod", "iowa", "gibe", "shad", "carl", "huns", "coot", "sera",
        "mils", "rose", "orly", "ford", "void", "time", "eloy", "risk", "veep",
        "reps", "dolt", "hens", "tray", "melt", "rung", "rich", "saga", "lust",
        "yews", "rode", "many", "cods", "rape", "last", "tile", "nosy", "take",
        "nope", "toni", "bank", "jock", "jody", "diss", "nips", "bake", "lima",
        "wore", "kins", "cult", "hart", "wuss", "tale", "sing", "lake", "bogy",
        "wigs", "kari", "magi", "bass", "pent", "tost", "fops", "bags", "duns",
        "will", "tart", "drug", "gale", "mold", "disk", "spay", "hows", "naps",
        "puss", "gina", "kara", "zorn", "boll", "cams", "boas", "rave", "sets",
        "lego", "hays", "judy", "chap", "live", "bahs", "ohio", "nibs", "cuts",
        "pups", "data", "kate", "rump", "hews", "mary", "stow", "fang", "bolt",
        "rues", "mesh", "mice", "rise", "rant", "dune", "jell", "laws", "jove",
        "bode", "sung", "nils", "vila", "mode", "hued", "cell", "fies", "swat",
        "wags", "nate", "wist", "honk", "goth", "told", "oise", "wail", "tels",
        "sore", "hunk", "mate", "luke", "tore", "bond", "bast", "vows", "ripe",
        "fond", "benz", "firs", "zeds", "wary", "baas", "wins", "pair", "tags",
        "cost", "woes", "buns", "lend", "bops", "code", "eddy", "siva", "oops",
        "toed", "bale", "hutu", "jolt", "rife", "darn", "tape", "bold", "cope",
        "cake", "wisp", "vats", "wave", "hems", "bill", "cord", "pert", "type",
        "kroc", "ucla", "albs", "yoko", "silt", "pock", "drub", "puny", "fads",
        "mull", "pray", "mole", "talc", "east", "slay", "jamb", "mill", "dung",
        "jack", "lynx", "nome", "leos", "lade", "sana", "tike", "cali", "toge",
        "pled", "mile", "mass", "leon", "sloe", "lube", "kans", "cory", "burs",
        "race", "toss", "mild", "tops", "maze", "city", "sadr", "bays", "poet",
        "volt", "laze", "gold", "zuni", "shea", "gags", "fist", "ping", "pope",
        "cora", "yaks", "cosy", "foci", "plan", "colo", "hume", "yowl", "craw",
        "pied", "toga", "lobs", "love", "lode", "duds", "bled", "juts", "gabs",
        "fink", "rock", "pant", "wipe", "pele", "suez", "nina", "ring", "okra",
        "warm", "lyle", "gape", "bead", "lead", "jane", "oink", "ware", "zibo",
        "inns", "mope", "hang", "made", "fobs", "gamy", "fort", "peak", "gill",
        "dino", "dina", "tier"
    };
    for (String word : words) {
      dict.add(word);
    }
    List<List<String>> totalList = t.findLadders("nape", "mild", dict);
    System.out.println(totalList);
  }
}
