public int countSubstrings(String s) {
  char[] chars = new char[s.length() + s.length() + 1];
  chars[0] = '#';
  for (int i = 1; i <= s.toCharArray().length; i++) {
      chars[i * 2 - 1] = s.toCharArray()[i-1];
      chars[i * 2] = '#';
  }

  int count = 0;
  for (int i = 0; i < chars.length; i++) {
      int left = i - 1;
      int right = i + 1;
      count += chars[i] != '#' ? 1 : 0;
      while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
          if (chars[left] != '#') {
              count++;
          }
          left--;
          right++;
      }
  }
  return count;
}