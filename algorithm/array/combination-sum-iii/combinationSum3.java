public List<List<Integer>> combinationSum3Set(int k, int start, int n) {
  List<List<Integer>> combinations = new ArrayList<>();
  for (int i = start; i <= 9 && i <= n; i++) {
      if (k == 1 && n == i) {
          List<Integer> set = new ArrayList<>();
          set.add(i);
          combinations.add(set);
          return combinations;
      }
      List<List<Integer>> rest = combinationSum3Set(k - 1, i + 1, n - i);
      for (List<Integer> c : rest) {
          if (c.size() > 0) {
              c.add(0, i);
              combinations.add(c);
          }
      }
  }
  return combinations;
}

public List<List<Integer>> combinationSum3(int k, int n) {
  return combinationSum3Set(k, 1, n);
}