public int maxProduct(int[] nums) {
  int max = nums[0];
  int minNagetive = nums[0];
  int maxPositive = nums[0];
  for (int i = 1; i < nums.length; i++) {
      int tmpMaxPositive = maxPositive;
      maxPositive = Math.max(Math.max(maxPositive * nums[i], nums[i]), minNagetive * nums[i]);
      minNagetive = Math.min(Math.min(minNagetive * nums[i], nums[i] * tmpMaxPositive), nums[i]);
      max = Math.max(max, maxPositive);
  }
  return max;
}