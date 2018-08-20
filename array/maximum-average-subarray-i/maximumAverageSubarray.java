public double findMaxAverage(int[] nums, int k) {
  int sum = 0;
  double max = 0;
  for (int i = 0; i < k; i++) {
      sum += nums[i];
      max = sum;
  }

  for (int i = k; i < nums.length; ++i) {
      sum = sum - nums[i - k] + nums[i];
      max = Math.max(max, sum);
  }
  return max / k;
}