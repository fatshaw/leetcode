private void reverseArray(int[] nums, int l, int r) {
  while (l < r) {
      int tmp = nums[l];
      nums[l] = nums[r];
      nums[r] = tmp;
      l++;
      r--;
  }
}

public void nextPermutation(int[] nums) {
  int firstGreater = -1;
  for (int i = nums.length - 2; i >= 0; i--) {
      if (nums[i] < nums[i + 1]) {
          firstGreater = i;
          break;
      }
  }
  if (firstGreater == -1) {
      reverseArray(nums, 0, nums.length - 1);
      return;
  }

  for (int i = nums.length - 1; i >= firstGreater + 1; i--) {
      if (nums[i] > nums[firstGreater]) {
          int tmp = nums[i];
          nums[i] = nums[firstGreater];
          nums[firstGreater] = tmp;
          break;
      }
  }

  reverseArray(nums, firstGreater + 1, nums.length - 1);

}