public int searchInsert(int[] nums, int target) {
  int ret = Arrays.binarySearch(nums, target);
  if (ret >= 0) {
      return ret;
  }
  return -(ret + 1);
}