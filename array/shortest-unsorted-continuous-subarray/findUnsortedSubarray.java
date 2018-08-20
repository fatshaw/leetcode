public int findUnsortedSubarray(int[] nums) {
  int min = Integer.MAX_VALUE;
  int max = Integer.MIN_VALUE;
  for (int i = 1; i < nums.length; ++i) {
      if (nums[i] < nums[i - 1]) {
          min = Math.min(min, nums[i]);
      }
  }
  for (int i = nums.length - 2; i >= 0; --i) {
      if (nums[i] > nums[i + 1]) {
          max = Math.max(max, nums[i]);
      }
  }

  int l = 0;
  int r = nums.length - 1;
  while (l <= r && nums[l] <= min) {
      l++;
  }
  while (l <= r && nums[r] >= max) {
      r--;
  }
  return r - l + 1;
}