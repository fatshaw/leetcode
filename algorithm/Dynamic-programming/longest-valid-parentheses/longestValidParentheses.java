public int longestValidParentheses(String s) {
  int[] longest = new int[s.length()];
  int max = 0;
  for (int i = 1; i < s.length(); ++i) {
      if (s.charAt(i) == ')' && i - longest[i - 1] - 1 >= 0 && s.charAt(i - longest[i - 1] - 1) == '(') {
          longest[i] =
              longest[i - 1] + 2 + ((i - longest[i - 1] - 2) >= 0 ? longest[i - longest[i - 1] - 2] : 0);
          max = Math.max(max, longest[i]);
      }
  }
  return max;
}