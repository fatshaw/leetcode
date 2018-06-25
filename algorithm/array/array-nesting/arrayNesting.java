public int arrayNesting(int[] nums) {
  int max = 0;
  for (int k = 0; k < nums.length; k++) {
      int result = 0;
      int i = k;

      while (true) {
          if (nums[i] >= 0) {
              int tmp = nums[i];
              nums[i] = -1;
              i = tmp;
              result += 1;
          } else {
              break;
          }
      }
      max = Math.max(result, max);
  }
  return max;
}