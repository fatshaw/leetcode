public int numFriendRequests(int[] ages) {
  Arrays.sort(ages);
  int count = 0;
  Map<Integer, Integer> counting = new HashMap<>();
  for (int i = 0; i < ages.length; i++) {
      if (0.5 * ages[i] + 7 < ages[i]) {
          counting.put(ages[i], counting.getOrDefault(ages[i], 0) + 1);
      }
  }
  for (int i = ages.length - 1; i > 0; i--) {
      int low = (int) (0.5 * ages[i] + 7 + 1);
      int l = 0;
      int r = i - 1;
      while (l < r) {
          int m = (l + r) / 2;
          if (ages[m] >= low) {
              r = m;
          } else {
              l = m + 1;
          }
      }
      if (low <= ages[l]) {
          count += i - l;
      }
      Integer preCount = counting.get(ages[i]);
      if (preCount != null && preCount > 0) {
          count += preCount - 1;
          counting.put(ages[i], preCount - 1);
      }
  }
  return count;
}