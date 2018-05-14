private void reverseChars(char[] chars, int l, int r) {
  while (l < r) {
      char tmp = chars[l];
      chars[l] = chars[r];
      chars[r] = tmp;
      l++;
      r--;
  }
}

public String reverseWords(String s) {
  char[] chars = s.toCharArray();
  reverseChars(chars, 0, chars.length - 1);
  int i = 0, j = 0;
  while (j < chars.length) {
      while (i < j || (i < chars.length && chars[i] == ' ')) {
          i++;
      }
      while (j < i || (j < chars.length && chars[j] != ' ')) {
          j++;
      }
      reverseChars(chars, i, j - 1);
  }
  return cleanInnerSpaces(chars);
}

private String cleanInnerSpaces(char[] chars) {
  int i = 0;
  int j = 0;
  while (j < chars.length) {
      while (j < chars.length && chars[j] == ' ') {
          j++;
      }
      while (j < chars.length && chars[j] != ' ') {
          chars[i++] = chars[j++];
      }
      while (j < chars.length && chars[j] == ' ') {
          j++;
      }
      if (j < chars.length) {
          chars[i++] = ' ';
      }
  }
  return new String(chars, 0, i);
}