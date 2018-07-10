void backtrackDup(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
  result.add(new ArrayList<>(temp));
  for (int i = start; i < nums.length; i++) {
      if (i > start && nums[i] == nums[i - 1]) {
          continue;
      }
      temp.add(nums[i]);
      backtrackDup(result, temp, nums, i + 1);
      temp.remove(temp.size() - 1);
  }
}

public List<List<Integer>> subsetsWithDup(int[] nums) {
  Arrays.sort(nums);
  List<List<Integer>> results = new ArrayList<>();
  backtrackDup(results, new ArrayList<>(), nums, 0);
  return results;
}