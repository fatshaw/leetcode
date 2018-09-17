public boolean PredictTheWinner(int[] nums) {
  int[][] dp = new int[nums.length + 1][nums.length + 1];
  for (int i = nums.length - 1; i >= 0; i--) {
      dp[i][i] = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
          dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
      }
  }
  return dp[0][nums.length - 1] >= 0;
}

public boolean PredictTheWinner(int[] nums) {
  int[] dp = new int[nums.length + 1];
  for (int i = nums.length - 1; i >= 0; i--) {
      dp[i] = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
          dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
      }
  }
  return dp[nums.length - 1] >= 0;
}

