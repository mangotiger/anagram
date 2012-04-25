package com.mangotiger.text;

import java.util.*;
import java.util.regex.*;

public class AnagramDetector {

  private static final Pattern NON_ALPHABET = Pattern.compile("[^A-Za-z]");

  public static boolean areAnagrams(String s1, String s2) {
    return countsFor(s1).equals(countsFor(s2));
  }

  private static Map<Character, Integer> countsFor(String s) {
    return new CharacterCounter().count(NON_ALPHABET.matcher(s == null ? "" : s).replaceAll("").toLowerCase());
  }
}
