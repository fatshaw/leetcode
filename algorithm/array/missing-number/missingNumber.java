public int missingNumber(int[] nums) {
  int sum = 0;
  for (int i = 0; i < nums.length; ++i) {
      sum += nums[i];
  }
  int expectedSum = (0 + nums.length) * (nums.length + 1) / 2;
  return expectedSum - sum;
}