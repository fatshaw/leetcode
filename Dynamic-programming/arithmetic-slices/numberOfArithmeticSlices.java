public int numberOfArithmeticSlices(int[] A) {
  int[] dp = new int[A.length];
  int count = 0;
  for (int j = 2; j < A.length; j++) {
      if (A[j] - A[j - 1] == A[j - 1] - A[j - 2]) {
          dp[j] = dp[j - 1] + 1;
          count += dp[j];
      }
  }
  return count;
}