public String longestPalindrome(String s) {

  StringBuilder sb = new StringBuilder("#");
  for (int i = 0; i < s.length(); i++) {
      sb.append(s.charAt(i)).append("#");
  }
  s = sb.toString();

  int id = 0;
  String max = "";
  int[] dp = new int[s.length()];
  for (int i = 0; i < s.length(); i++) {
      // manacher's algorithm
      /**
       * mx----j------id------i----mx : dp[i]=mx-i
       * mx------i----id----i------mx : dp[i]=dp[2 * id - i]
       * mx-id-mx------i------: dp[i] = 1
       */
      dp[i] = i < (id + max.length() / 2) ? Math.min(dp[2 * id - i], id + max.length() / 2 - i) : 1;
      String tmp = palindrome(s, i, dp);
      if (tmp.length() > max.length()) {
          max = tmp;
          id = i;
      }
  }

  return max.replace("#", "");

}

public String palindrome(String s, int i, int[] dp) {
  while (i - dp[i] >= 0 && i + dp[i] < s.length() && s.charAt(i - dp[i]) == s.charAt(i + dp[i])) {
      dp[i]++;
  }
  return s.substring(i - dp[i] + 1, i + dp[i] - 1);
}