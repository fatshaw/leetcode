public int minSubArrayLen(int s, int[] nums) {
  int sum = 0;
  int left = 0;
  int min = nums.length + 1;
  for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      while (sum >= s && left <= i) {
          min = Math.min(min, i - left + 1);
          sum -= nums[left++];
      }
  }
  return min > nums.length ? 0 : min;
}