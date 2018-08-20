public int splitArray(int[] nums, int m) {
  int sum = 0;
  int max = 0;
  for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      max = Math.max(nums[i], max);
  }

  long l = max;
  long r = sum;
  while (l < r) {
      long mid = (l + r) / 2;
      if (isValid(nums, mid, m)) {
          r = mid;
      } else {
          l = mid + 1;
      }
  }

  return (int) l;
}

public boolean isValid(int[] nums, long target, int m) {
  int count = 1;
  int total = 0;
  for (int n : nums) {
      total += n;
      if (total > target) {
          total = n;
          count++;
      }
      if (count > m) {
          return false;
      }
  }
  return true;
}