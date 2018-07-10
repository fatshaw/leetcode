void backtrackPermute(List<List<Integer>> result, List<Integer> temp, int[] nums) {
  if (temp.size() == nums.length) {
      result.add(new ArrayList<>(temp));
  }
  for (int i = 0; i < nums.length; i++) {
      if (temp.contains(nums[i])) {
          continue;
      }
      temp.add(nums[i]);
      backtrackPermute(result, temp, nums);
      temp.remove(temp.size() - 1);
  }
}

public List<List<Integer>> permute(int[] nums) {
  List<List<Integer>> results = new ArrayList<>();
  backtrackPermute(results, new ArrayList<>(), nums);
  return results;
}