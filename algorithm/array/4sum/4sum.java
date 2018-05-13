public List<List<Integer>> fourSum(int[] nums, int target) {
  Arrays.sort(nums);
  int i = 0;
  List<List<Integer>> result = new ArrayList<>();

  while (i < nums.length - 3) {
      List<List<Integer>> ret = threeSum(nums, i + 1, target - nums[i]);
      if (ret.size() > 0) {
          for (List<Integer> l : ret) {
              l.add(0, nums[i]);
          }
          result.addAll(ret);
      }
      while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
          i++;
      }
      i++;
  }

  return result;
}


public List<List<Integer>> threeSum(int[] nums, int start, int target) {
  List<List<Integer>> list = new LinkedList<>();
  for (int i = start; i < nums.length - 2; i++) {
      if (i == start || nums[i] != nums[i - 1]) {
          int low = i + 1;
          int high = nums.length - 1;
          while (low < high) {
              int sum = target - nums[i];
              if (nums[low] + nums[high] == sum) {
                  List<Integer> sub = new ArrayList<>();
                  sub.add(nums[i]);
                  sub.add(nums[low]);
                  sub.add(nums[high]);
                  list.add(sub);
                  while (low < high && nums[low] == nums[low + 1]) {
                      low++;
                  }
                  while (low < high && nums[high] == nums[high - 1]) {
                      high--;
                  }
                  low++;
                  high--;
              } else if (nums[low] + nums[high] < sum) {
                  low++;
              } else {
                  high--;
              }
          }
      }
  }
  return list;
}