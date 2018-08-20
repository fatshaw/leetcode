public List<String> summaryRanges(int[] nums) {
  List<String> results = new ArrayList<>();
  if (nums.length == 0) {
      return results;
  }

  int left = 0;
  for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1] + 1) {
          if (i - 1 > left) {
              results.add(nums[left] + "->" + nums[i - 1]);
          } else {
              results.add(String.valueOf(nums[left]));
          }
          left = i;
      }
  }

  if (nums.length - 1 > left) {
      results.add(nums[left] + "->" + nums[nums.length - 1]);
  } else {
      results.add(String.valueOf(nums[left]));
  }

  return results;
}
