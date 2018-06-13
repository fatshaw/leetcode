private void reverseArray(int[] nums, int l, int r) {
  while (l < r) {
      int tmp = nums[l];
      nums[l] = nums[r];
      nums[r] = tmp;
      l++;
      r--;
  }
}

public void rotate(int[] nums, int k) {
  k = k % nums.length;
  reverseArray(nums, 0, nums.length - 1);
  reverseArray(nums, 0, k - 1);
  reverseArray(nums, k, nums.length - 1);
}