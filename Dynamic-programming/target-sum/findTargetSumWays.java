public int findTargetSumWays(int[] nums, int S) {
  Map<Integer, Integer> pre = new HashMap<>();
  for (int i = 0; i < nums.length; i++) {
      Map<Integer, Integer> p = new HashMap<>();
      if (i == 0) {
          p.put(nums[i], p.getOrDefault(nums[i], 0) + 1);
          p.put(-nums[i], p.getOrDefault(-nums[i], 0) + 1);
      } else {
          for (Map.Entry<Integer, Integer> pp : pre.entrySet()) {
              p.put(pp.getKey() + nums[i], p.getOrDefault(pp.getKey() + nums[i], 0) + pp.getValue());
              p.put(pp.getKey() - nums[i], p.getOrDefault(pp.getKey() - nums[i], 0) + pp.getValue());
          }
      }
      pre = p;
  }
  return pre.getOrDefault(S, 0);
}