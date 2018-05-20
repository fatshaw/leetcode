public int lengthOfLIS(int[] nums) {
  if (nums == null || nums.length == 0) {
      return 0;
  }

  int max = 0;
  int dp[] = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
      int k = Arrays.binarySearch(dp, 0, max, nums[i]);
      if (k < 0) {
          k = -(k + 1);
      }
      dp[k] = nums[i];
      if (k == max) {
          ++max;
      }
  }
  return max;
}