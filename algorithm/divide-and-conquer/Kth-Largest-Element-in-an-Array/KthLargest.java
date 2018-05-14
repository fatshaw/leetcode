public int findKthLargest(int[] nums, int l, int r, int k) {
  int pivot = nums[l];
  int left = l;
  int right = r;
  while (l < r) {
      while (l < r && nums[r] >= pivot) {
          r--;
      }
      if (l < r) {
          nums[l] = nums[r];
          l++;
      }
      while (l < r && nums[l] < pivot) {
          l++;
      }
      if (l < r) {
          nums[r] = nums[l];
          r--;
      }
  }
  nums[l] = pivot;

  int size = right - l + 1;
  if (size == k) {
      return pivot;
  } else if (size > k) {
      return findKthLargest(nums, l + 1, right, k);
  } else {
      return findKthLargest(nums, left, l - 1, k - size);
  }
}


public int findKthLargest(int[] nums, int k) {
  return findKthLargest(nums, 0, nums.length - 1, k);
}