public int findLongestChain(int[][] pairs) {
  Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

  int max = pairs[0][1];
  int length = 1;
  for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] > max) {
          max = pairs[i][1];
          length++;
      }
  }
  return length;
}