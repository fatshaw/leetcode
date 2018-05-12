public int maxSubArray(int[] nums) {
  int max = Integer.MIN_VALUE;
  int sumEnd = 0;
  for (int n : nums) {
      if (sumEnd < 0) {
          sumEnd = n;
      } else {
          sumEnd = sumEnd + n;
      }
      if (sumEnd > max) {
          max = sumEnd;
      }
  }
  return max;
}