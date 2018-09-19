public boolean isSubsequence(String s, String t) {
  int count = 0;
  int j = 0;
  for (int i = 0; i < s.length(); i++) {
      while (j < t.length()) {
          if (s.charAt(i) == t.charAt(j++)) {
              count += 1;
              break;
          }
      }
  }
  return count == s.length();
}