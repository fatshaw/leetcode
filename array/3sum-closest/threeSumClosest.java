public int threeSumClosest(int[] nums, int target) {
  Arrays.sort(nums);
  int sum = nums[0] + nums[1] + nums[2];
  for (int i = 0; i < nums.length - 2; i++) {
      int l = i + 1;
      int r = nums.length - 1;
      while (l < r) {
          if (Math.abs(nums[i] + nums[l] + nums[r] - target) < Math.abs(sum - target)) {
              sum = nums[i] + nums[l] + nums[r];
          }
          if (sum == target) {
              return sum;
          }
          if (nums[l] + nums[r] > target - nums[i]) {
              r--;
          } else {
              l++;
          }
      }
  }
  return sum;
}