public int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> map = new HashMap<>();
	int[] ret = null;
	for (int i = 0; i < nums.length; ++i) {
		if (map.get(target - nums[i]) != null) {
			ret = new int[2];
			ret[0] = map.get(target - nums[i]);
			ret[1] = i;
			break;
		} else {
			map.put(nums[i], i);
		}
	}
	return ret;
}
