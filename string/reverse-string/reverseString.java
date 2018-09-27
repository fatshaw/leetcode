public String reverseString(String s) {
  char[] c = s.toCharArray();
  int l = 0;
  int r = c.length - 1;
  while (l < r) {
      char t = c[l];
      c[l] = c[r];
      c[r] = t;
      l++;
      r--;
  }
  return String.valueOf(c);
}