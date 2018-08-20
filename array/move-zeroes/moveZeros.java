public void moveZeroes(int[] nums) {
  int nonZeroNumber = 0;
  for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != 0) {
          int tmp = nums[nonZeroNumber];
          nums[nonZeroNumber] = nums[i];
          nums[i] = tmp;
          nonZeroNumber++;
      }
  }
}

public void moveZeroes(int[] nums) {
  int nonZeroNumber = 0;
  for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != 0) {
          nums[nonZeroNumber++] = nums[i];
      }
  }
  for (int i = nonZeroNumber; i < nums.length; ++i) {
      nums[i] = 0;
  }
}