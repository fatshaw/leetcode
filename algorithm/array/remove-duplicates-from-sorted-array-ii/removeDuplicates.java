public int removeDuplicates(int[] nums) {
  int next = 0;
  for (int n : nums) {
      if (next < 2 || n > nums[next - 2]) {
          nums[next++] = n;
      }
  }
  return next;
}