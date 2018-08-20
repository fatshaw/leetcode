public int lengthOfLIS(int[] nums) {
  if (nums == null || nums.length == 0) {
       return 0;
   }

   int max = 1;
   int dp[] = new int[nums.length];
   for (int i = nums.length - 1; i >= 0; i--) {
       dp[i] = 1;
       for (int j = nums.length - 1; j > i; j--) {
           if (nums[j] > nums[i]) {
               dp[i] = Math.max(dp[i], 1 + dp[j]);
               max = Math.max(dp[i], max);
           }
       }
   }
   return max;
}