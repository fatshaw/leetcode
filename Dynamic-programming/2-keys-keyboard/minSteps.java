public int minSteps(int n) {
  if (n == 1) {
      return 0;
  }
  int dp[] = new int[n + 1];
  for (int i = 2; i <= n; i++) {
      dp[i] = i;
      for (int k = 2; k < i / 2; k++) {
          if (i % k == 0) {
              dp[i] = dp[i / k] + k;
              break;
          }
      }
  }
  return dp[n];
}