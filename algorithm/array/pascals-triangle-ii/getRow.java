public List<Integer> getRow(int rowIndex) {
  List<Integer> last = new ArrayList<>();
  for (int i = 0; i <= rowIndex; ++i) {
      List<Integer> current = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
          if (j == 0 || j == i) {
              current.add(1);
          } else {
              current.add(last.get(j - 1) + last.get(j));
          }
      }
      last = current;
  }
  return last;
}