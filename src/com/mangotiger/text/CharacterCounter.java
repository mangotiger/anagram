package com.mangotiger.text;

import java.util.*;

public class CharacterCounter {
  private final Map<Character, Integer> map = new HashMap<Character, Integer>();

  public Map<Character, Integer> count(String s) {
    if (s != null)
      for (int i = 0; i < s.length(); ++i) {
        char c    = s.charAt(i);
        int count = map.containsKey(c) ? map.get(c) + 1 : 1;
        map.put(c, count);
      }
    return map;
  }
}

