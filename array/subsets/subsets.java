void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
  result.add(new ArrayList<>(temp));
  for (int i = start; i < nums.length; i++) {
      temp.add(nums[i]);
      backtrack(result, temp, nums, i + 1);
      temp.remove(temp.size() - 1);
  }
}

public List<List<Integer>> subsets(int[] nums) {
  List<List<Integer>> results = new ArrayList<>();
  backtrack(results, new ArrayList<>(), nums, 0);
  return results;
}