// dp
public boolean canJump(int[] nums) {
  int[] dp = new int[nums.length];
  dp[nums.length - 1] = 1;
  for (int i = nums.length - 2; i >= 0; i--) {
      for (int j = 1; j <= nums[i]; j++) {
          if (i + j < nums.length) {
              dp[i] = Math.max(dp[i + j], dp[i]);
              if (dp[i] == 1) {
                  break;
              }
          }
      }
  }
  return dp[0] == 1;
}

// greedy
public boolean canJump(int[] nums) {
  int lastPos = nums.length - 1;
  for (int i = nums.length - 2; i >= 0; i--) {
      if (i + nums[i] >= lastPos) {
          lastPos = i;
      }
  }
  return lastPos == 0;
}