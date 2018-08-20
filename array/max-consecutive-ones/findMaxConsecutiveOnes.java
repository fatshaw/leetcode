public int findMaxConsecutiveOnes(int[] nums) {
  int cur = 0;
  int max = 0;
  for (int i = 0; i < nums.length; ++i) {
      if (nums[i] == 1) {
          cur++;
          max = Math.max(cur, max);
      } else {
          cur = 0;
      }
  }
  return max;
}