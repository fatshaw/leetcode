public int deleteAndEarn(int[] nums) {
  int[] remained = new int[10001];
  for (int i = 0; i < nums.length; i++) {
      remained[nums[i]]++;
  }
  int take = 0;
  int skip = 0;
  int pretake = 0;
  int preskip = 0;
  for (int i = 1; i <= 10000; i++) {
      take = preskip + remained[i] * i;
      skip = Math.max(pretake, preskip);
      preskip = skip;
      pretake = take;
  }
  return Math.max(take, skip);
}