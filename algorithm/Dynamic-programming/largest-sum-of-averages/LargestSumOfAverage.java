public double largestSumOfAverages(int[] A, int K) {
  double sum[] = new double[A.length + 1];
  double s = 0;
  for (int i = 1; i <= A.length; ++i) {
      sum[i] = s + A[i - 1];
      s += A[i - 1];
  }

  double[][] dp = new double[A.length + 1][K + 1];
  for (int i = 1; i <= A.length; ++i) {
      dp[i][1] = (sum[A.length] - sum[i - 1]) / (A.length - i + 1);
  }

  for (int j = 2; j <= K; j++) {
      for (int i = 1; i <= A.length; ++i) {
          for (int l = i + 1; l <= A.length; l++) {
              dp[i][j] = Math.max(dp[i][j], (sum[l - 1] - sum[i - 1]) / (l - i) + dp[l][j - 1]);
          }
      }
  }

  return dp[1][K];
}