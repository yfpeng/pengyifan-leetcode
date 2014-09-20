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

  @Test
  public void testFindLadders4() {
    Set<String> dict = new HashSet<String>();
    String[] words = {
        "heaping", "conning", "nipping", "wadding", "pulling", "lunging",
        "figging", "donning", "jamming", "coating", "foaling", "ousting",
        "dowsing", "busting", "penning", "lapping", "yanking", "sapping",
        "tasking", "rigging", "ranking", "larking", "farming", "dunging",
        "nutting", "gouging", "barfing", "fasting", "belting", "boiling",
        "boating", "dipping", "kilning", "barking", "furling", "calving",
        "veiling", "decking", "ricking", "salting", "lucking", "sending",
        "taiping", "marking", "martina", "warping", "bulking", "seaming",
        "topping", "larding", "jilting", "besting", "weeding", "nesting",
        "baiting", "jibbing", "pelting", "bushing", "garbing", "banting",
        "keeping", "venting", "rapping", "binning", "mulling", "smiting",
        "hatting", "tapping", "writing", "footing", "carding", "ratting",
        "bagging", "sitting", "dousing", "pinking", "testing", "passing",
        "gelling", "gassing", "ranging", "hefting", "vamping", "wetting",
        "paining", "rolling", "sinking", "yakking", "shaking", "nabbing",
        "licking", "sparing", "hamming", "celling", "halving", "matting",
        "landing", "kooking", "pinning", "hagging", "narking", "soaping",
        "winding", "dealing", "earring", "cunning", "moating", "skiting",
        "jutting", "fueling", "hooping", "guiling", "mapping", "hailing",
        "gutting", "firming", "bunting", "mealing", "rending", "jobbing",
        "pauling", "foiling", "peeking", "rollins", "lansing", "felling",
        "whiting", "vealing", "resting", "saltine", "earning", "purging",
        "mullins", "pausing", "colling", "banning", "wasting", "sealing",
        "gigging", "scaring", "pocking", "massing", "curring", "storing",
        "dinging", "handing", "pitting", "faining", "cupping", "staring",
        "riffing", "gowning", "hipping", "vanning", "darting", "maiming",
        "damping", "deaning", "bellini", "kipling", "marting", "hawking",
        "fending", "kicking", "beading", "curving", "wending", "yelling",
        "foaming", "rifting", "surging", "gaining", "stoking", "panging",
        "winking", "nursing", "oinking", "looking", "tolling", "bailing",
        "tanking", "hacking", "warming", "cooping", "wanting", "rotting",
        "kinking", "bugging", "purling", "wincing", "joining", "belling",
        "wilting", "tensing", "fellini", "wilding", "binding", "bugling",
        "sagging", "nagging", "binging", "tatting", "cellini", "silting",
        "belying", "ripping", "crating", "slaking", "killing", "hurting",
        "running", "harming", "banding", "rinking", "staying", "touting",
        "hasting", "melting", "nibbing", "talking", "ganging", "bonging",
        "rilling", "damning", "pooling", "porting", "sinning", "collins",
        "barbing", "bunking", "smiling", "hanging", "tending", "bulging",
        "ginning", "coiling", "lolling", "molting", "letting", "mending",
        "hinging", "gunning", "melding", "dilling", "shaving", "harping",
        "basting", "cobbing", "carting", "leading", "styling", "fowling",
        "goading", "yowling", "zipping", "wagging", "gaoling", "panning",
        "valving", "peeling", "titling", "sailing", "harding", "parring",
        "haloing", "quiting", "punting", "reeling", "batting", "signing",
        "pegging", "bogging", "mashing", "rankine", "seeding", "sassing",
        "wafting", "winging", "framing", "rooting", "longing", "sabling",
        "bulbing", "whiling", "balking", "canting", "dashing", "dueling",
        "renting", "booting", "whaling", "vatting", "veining", "fencing",
        "yucking", "slaving", "welling", "sunning", "lulling", "purring",
        "dawning", "sensing", "meaning", "wording", "hogging", "parsing",
        "falling", "yelping", "dinning", "vetting", "hulling", "reading",
        "lapsing", "tooling", "hoaxing", "roiling", "forming", "ramming",
        "gelding", "felting", "popping", "walling", "costing", "welding",
        "washing", "filling", "lasting", "couping", "cabling", "getting",
        "winning", "carping", "martins", "bilking", "burning", "jelling",
        "sicking", "tinting", "ceiling", "totting", "balding", "kenning",
        "tinging", "hugging", "westing", "burring", "pasting", "pecking",
        "parking", "slaying", "pigging", "heating", "manning", "bucking",
        "bussing", "gagging", "goaling", "rowling", "netting", "funking",
        "pitying", "jarring", "tasting", "putting", "beating", "funding",
        "mauling", "balling", "molding", "shining", "perkins", "dialing",
        "panting", "looping", "welting", "relying", "dulling", "dumping",
        "tanning", "warring", "gatling", "staging", "finding", "farting",
        "petting", "picking", "swaying", "toiling", "jambing", "bawling",
        "minting", "wedding", "hulking", "keeling", "nanking", "railing",
        "heading", "cutting", "gosling", "vesting", "sighing", "mucking",
        "copping", "polling", "raising", "fooling", "hooting", "titting",
        "calming", "seating", "rifling", "soiling", "dubbing", "jesting",
        "posting", "sacking", "corking", "yipping", "lathing", "bopping",
        "setting", "coaxing", "poshing", "fawning", "heeling", "warning",
        "napping", "vending", "mooting", "hurling", "supping", "nanjing",
        "pipping", "tagging", "mopping", "souping", "palming", "gulling",
        "kirking", "gilding", "docking", "wefting", "dusting", "sharing",
        "darling", "bowling", "lauding", "bidding", "hopping", "honking",
        "hunting", "pepping", "busying", "damming", "patting", "hitting",
        "gusting", "jigging", "gabbing", "hosting", "sidling", "telling",
        "rusting", "daubing", "reining", "memling", "healing", "gashing",
        "betting", "lilting", "hashing", "salving", "firring", "gabling",
        "ducking", "waiving", "skating", "worming", "waiting", "burying",
        "booking", "corning", "suiting", "hooking", "gonging", "listing",
        "hulaing", "sulking", "digging", "fouling", "zincing", "cocking",
        "packing", "scaling", "pooping", "zinging", "banging", "bolling",
        "punning", "palling", "sipping", "bunging", "minding", "choking",
        "yapping", "nicking", "warding", "gorging", "canning", "culling",
        "lending", "spaying", "lashing", "pupping", "fanning", "banking",
        "pinging", "roaming", "sopping", "fonding", "searing", "fucking",
        "rooking", "tooting", "raining", "billing", "pulsing", "curbing",
        "cashing", "calking", "harking", "tarring", "tacking", "whining",
        "tarting", "pauline", "rasping", "howling", "helling", "curling",
        "pucking", "hauling", "coaling", "lopping", "mailing", "wailing",
        "lugging", "ticking", "staving", "snaking", "selling", "masking",
        "jabbing", "mewling", "heaving", "soaring", "fagging", "cording",
        "begging", "ridging", "jetting", "backing", "dotting", "lacking",
        "parting", "jotting", "dunning", "tinning", "stiling", "stating",
        "zapping", "hearing", "fitting", "barging", "galling", "wigging",
        "feeding", "tenting", "looting", "cabbing", "cursing", "dunking",
        "dabbing", "ragging", "bedding", "witting", "pouting", "burping",
        "slating", "tamping", "basking", "failing", "papping", "narcing",
        "lancing", "furlong", "tabling", "dolling", "tailing", "pawning",
        "collies", "lamming", "coifing", "bolting", "sucking", "rafting",
        "morning", "ranting", "tabbing", "rinding", "bandung", "bashing",
        "bending", "ducting", "casting", "camping", "flaming", "hinting",
        "sanding", "carving", "lagging", "helping", "keening", "jolting",
        "temping", "junking", "manging", "dimming", "ringing", "tipping",
        "spiking", "malling", "pursing", "soaking", "willing", "fulling",
        "causing", "jacking", "furring", "singing", "halting", "tucking",
        "ruining", "denting", "calling", "barring", "fopping", "yawning",
        "tilling", "nilling", "downing", "cooling", "martini", "budging",
        "lapwing", "mincing", "rinsing", "cowling", "marring", "coining",
        "sibling", "potting", "tauting", "bulling", "lurking", "sorting",
        "poohing", "bathing", "spicing", "nailing", "spiting", "racking",
        "lusting", "rutting", "gulping", "tilting", "pairing", "peaking",
        "capping", "gobbing", "finking"
    };
    for (String word : words) {
      dict.add(word);
    }
    List<List<String>> totalList = t.findLadders("raining", "cellini", dict);
    System.out.println(totalList);
  }
}
