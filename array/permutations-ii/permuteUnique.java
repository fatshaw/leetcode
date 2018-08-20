void backtrackPermute(List<List<Integer>> result, Map<Integer, Integer> temp, int[] nums) {
  if (temp.size() == nums.length) {
      result.add(new ArrayList<>(temp.values()));
  }
  for (int i = 0; i < nums.length; i++) {
      if (temp.containsKey(i)) {
          continue;
      }
      // 对于 1 1 2这种情况，如果第一个位置1已经被使用，则不能再使用第二个位置的1
      if (i > 0 && nums[i] == nums[i - 1] && !temp.containsKey(i - 1)) {
          continue;
      }
      temp.put(i, nums[i]);
      backtrackPermute(result, temp, nums);
      temp.remove(i);
  }
}

public List<List<Integer>> permuteUnique(int[] nums) {
  Arrays.sort(nums);
  List<List<Integer>> results = new ArrayList<>();
  backtrackPermute(results, new LinkedHashMap<>(), nums);
  return results;
}