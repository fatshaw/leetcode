int generateMatrix(int[][] result, int n, int startX, int startNumber) {
  int tmp = startNumber;
  for (int i = startX; i < n - startX; i++) {
      result[startX][i] = ++tmp;
  }
  for (int i = startX + 1; i < n - startX; i++) {
      result[i][n - startX - 1] = ++tmp;
  }
  for (int i = n - startX - 2; i >= startX; i--) {
      result[n - startX - 1][i] = ++tmp;
  }
  for (int i = n - startX - 2; i >= startX + 1; i--) {
      result[i][startX] = ++tmp;
  }
  return tmp;
}

public int[][] generateMatrix(int n) {
  int[][] result = new int[n][n];
  int tmp = 0;
  for (int i = 0; i < n; i++) {
      tmp = generateMatrix(result, n, i, tmp);
  }
  return result;
}