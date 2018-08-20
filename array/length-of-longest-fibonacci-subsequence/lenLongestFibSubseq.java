public int lenLongestFibSubseq(int[] A) {

  Map<Integer, Integer> map = IntStream.range(0, A.length).boxed()
      .collect(Collectors.toMap(i -> A[i], Function.identity()));

  int[][] dp = new int[A.length][A.length];
  int max = 0;
  for (int i = 2; i < A.length; ++i) {
      for (int j = i - 1; j >= 0; j--) {
          int k = map.getOrDefault(A[i] - A[j], A.length);
          if (k < j) {
              dp[i][j] = Math.max(3, dp[j][k] + 1);
          }
          max = Math.max(max, dp[i][j]);
      }
  }
  
  return max;
}