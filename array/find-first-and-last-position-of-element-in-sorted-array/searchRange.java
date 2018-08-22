public int[] searchRange(int[] nums, int target) {
  int l = 0;
  int r = nums.length - 1;
  int[] ret = new int[]{
      -1, -1
  };

  if (nums.length == 0) {
      return ret;
  }

  while (l < r) {
      int mid = (l + r) / 2;
      if (nums[mid] < target) {
          l = mid + 1;
      } else {
          r = mid;
      }
  }
  if (nums[r] != target) {
      return ret;
  }
  ret[0] = r;

  r = nums.length - 1;
  while (l <= r) {
      int mid = (l + r) / 2;
      if (nums[mid] > target) {
          r = mid - 1;
      } else {
          l = mid + 1;
      }
  }
  if (nums[l - 1] != target) {
      return ret;
  }
  ret[1] = l - 1;
  return ret;
}