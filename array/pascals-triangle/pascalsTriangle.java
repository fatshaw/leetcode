public List<List<Integer>> generate(int numRows) {
  List<List<Integer>> results = new ArrayList<>();
  for (int i = 0; i < numRows; ++i) {
      List<Integer> list = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
          if (j == 0 || j == i) {
              list.add(1);
          } else {
              list.add(results.get(i - 1).get(j-1) + results.get(i - 1).get(j));
          }
      }
      results.add(list);
  }
  return results;
}