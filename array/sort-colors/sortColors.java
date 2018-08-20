public void sortColors(int[] nums) {
  int indexOfZero = 0;
  int indexOfOne = 0;
  for (int i = 0; i < nums.length; ++i) {
      int v = nums[i];
      nums[i] = 2;
      if (v < 2) {
          nums[indexOfOne] = 1;
          indexOfOne++;
      }
      if (v == 0) {
          nums[indexOfZero] = 0;
          indexOfZero++;
      }
  }
}