public int[][] flipAndInvertImage(int[][] A) {
  for (int[] a : A) {
      int i = 0;
      int j = a.length - 1;
      while (i < j) {
          int tmp = a[i];
          a[i] = a[j];
          a[j] = tmp;
          a[i] = a[i] == 1 ? 0 : 1;
          a[j] = a[j] == 1 ? 0 : 1;
          i++;
          j--;
      }

      if (i == j) {
          a[i] = a[i] == 1 ? 0 : 1;
      }
  }
  return A;
}