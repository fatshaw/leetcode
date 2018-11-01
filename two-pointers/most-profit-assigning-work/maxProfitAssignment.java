public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
  Map<Integer, Integer> profiles = new HashMap<>();
  for (int i = 0; i < difficulty.length; i++) {
      profiles.put(difficulty[i], Math.max(profiles.getOrDefault(difficulty[i], 0), profit[i]));
  }

  Arrays.sort(difficulty);
  Arrays.sort(worker);
  int wi = 0;
  int di = 0;
  int totalProfit = 0;
  int maxProfitForCurrentWorker = 0;
  while (wi < worker.length) {
      while (di < difficulty.length && difficulty[di] <= worker[wi]) {
          maxProfitForCurrentWorker = Math.max(maxProfitForCurrentWorker, profiles.get(difficulty[di]));
          di++;
      }
      totalProfit += maxProfitForCurrentWorker;
      wi++;
  }
  return totalProfit;
}