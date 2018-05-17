public int minCostClimbingStairs(int[] cost) {
  int[] sum = new int[cost.length + 1];
  for (int i = 2; i < cost.length + 1; i++) {
      sum[i] = Math.min(sum[i - 1] + cost[i - 1], sum[i - 2] + cost[i - 2]);
  }
  return sum[cost.length];
}