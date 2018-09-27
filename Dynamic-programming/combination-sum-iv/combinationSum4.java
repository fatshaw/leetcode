// buttom-up
public int combinationSum4(int[] nums, int target) {
  Arrays.sort(nums);
  int dp[] = new int[target + 1];
  dp[0] = 1;
  for (int i = 1; i <= target; i++) {
      int j = 0;
      while (j < nums.length && nums[j] <= i) {
          dp[i] += dp[i - nums[j]];
          j++;
      }
  }
  return dp[target];
}

// top-down 
public int combinationSum4Dp(int[] nums, int target, int[] dp) {
  if (dp[target] >= 0) {
      return dp[target];
  }

  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
      if (nums[i] <= target) {
          sum += combinationSum4Dp(nums, target - nums[i], dp);
      }
  }
  dp[target] = sum;
  return sum;
}

public int combinationSum4(int[] nums, int target) {
  int[] dp = new int[target + 1];
  Arrays.fill(dp, -1);
  dp[0] = 1;
  return combinationSum4Dp(nums, target, dp);
}