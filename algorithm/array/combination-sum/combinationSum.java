void backtrackCombination(List<List<Integer>> result, List<Integer> temp, int[] nums, int remain, int start) {
  if (remain == 0) {
      result.add(new ArrayList<>(temp));
  }
  if (remain > 0) {
      for (int i = start; i < nums.length; i++) {
          temp.add(nums[i]);
          backtrackCombination(result, temp, nums, remain - nums[i], i);
          temp.remove(temp.size() - 1);
      }
  }
}

public List<List<Integer>> combinationSum(int[] candidates, int target) {
  Arrays.sort(candidates);
  List<List<Integer>> results = new ArrayList<>();
  backtrackCombination(results, new ArrayList<>(), candidates, target, 0);
  return results;
}