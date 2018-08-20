public List<List<Integer>> largeGroupPositions(String S) {
  char[] chars = S.toCharArray();
  int start = 0;
  int end = 0;
  List<List<Integer>> result = new ArrayList<>();

  while (end < chars.length) {
      while (end < chars.length && chars[end] == chars[start]) {
          end++;
      }
      if (end - start > 2) {
          result.add(Arrays.asList(start, end - 1));
      }
      start = end;
  }

  return result;
}
