void backtrackCombination2(List<List<Integer>> result, List<Integer> temp, int[] nums, int remain, int start) {
  if (remain == 0) {
      result.add(new ArrayList<>(temp));
  }
  if (remain > 0) {
      for (int i = start; i < nums.length; i++) {
          if (i > start && nums[i] == nums[i - 1]) {
              continue;
          }
          temp.add(nums[i]);
          backtrackCombination2(result, temp, nums, remain - nums[i], i + 1);
          temp.remove(temp.size() - 1);
      }
  }
}

public List<List<Integer>> combinationSum2(int[] candidates, int target) {
  Arrays.sort(candidates);
  List<List<Integer>> results = new ArrayList<>();
  backtrackCombination2(results, new ArrayList<>(), candidates, target, 0);
  return results;
}