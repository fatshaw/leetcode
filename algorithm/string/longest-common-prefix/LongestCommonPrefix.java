public String longestCommonPrefix(String[] strs) {
  if (strs == null || strs.length == 0) {
      return "";
  }

  String prefix = strs[0];
  int i;
  for (String s : strs) {
      if (prefix == "") {
          break;
      }
      for (i = 0; i < prefix.length(); i++) {
          if (i >= s.length() || prefix.charAt(i) != s.charAt(i)) {
              break;
          }
      }
      prefix = prefix.substring(0, i);
  }

  return prefix;
}