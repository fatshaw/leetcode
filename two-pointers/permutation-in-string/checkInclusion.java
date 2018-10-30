public boolean checkInclusion(String s1, String s2) {
  for (int j = 0; j < s2.length() - s1.length() + 1; j++) {
      char[] chars = new char[26];
      for (int i = 0; i < s1.length(); i++) {
          chars[s1.charAt(i) - 'a'] += 1;
          chars[s2.charAt(j + i) - 'a'] -= 1;
      }
      boolean iszero = true;
      for (int i = 0; i < 26; i++) {
          if (chars[i] != 0) {
              iszero = false;
          }
      }
      if (iszero) {
          return true;
      }
  }
  return false;
}