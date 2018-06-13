public int findPairs(int[] nums, int k) {
  if (k < 0) {
      return 0;
  }
  Map<Integer, List<Integer>> numMap = new HashMap<>();
  for (int i = 0; i < nums.length; i++) {
      List<Integer> list = numMap.getOrDefault(nums[i], new ArrayList<>());
      list.add(i);
      numMap.put(nums[i], list);
  }
  int c = 0;
  for (Map.Entry<Integer, List<Integer>> entry : numMap.entrySet()) {
      if (k == 0) {
          if (entry.getValue().size() >= 2) {
              c++;
          }
      } else {
          if (numMap.get(entry.getKey() + k) != null) {
              c++;
          }
      }
  }
  return c;
}