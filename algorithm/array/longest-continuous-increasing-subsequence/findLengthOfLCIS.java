public int findLengthOfLCIS(int[] nums) {
  if (nums == null || nums.length == 0) {
      return 0;
  }
  int cur = 1;
  int max = 1;
  for (int i = 1; i < nums.length; ++i) {
      if (nums[i] > nums[i - 1]) {
          cur += 1;
          max = Math.max(max, cur);
      } else {
          cur = 1;
      }
  }
  return max;
}