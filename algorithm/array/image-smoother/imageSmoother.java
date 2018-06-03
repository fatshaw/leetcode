public int[][] imageSmoother(int[][] M) {
  int[][] ret = new int[M.length][M[0].length];
  for (int i = 0; i < M.length; ++i) {
      for (int j = 0; j < M[0].length; ++j) {
          double sum = M[i][j];
          int size = 1;
          // up
          if (i - 1 >= 0) {
              sum += M[i - 1][j];
              size++;
          }
          // down
          if (i + 1 < M.length) {
              sum += M[i + 1][j];
              size++;
          }
          // left
          if (j - 1 >= 0) {
              sum += M[i][j - 1];
              size++;
          }
          // right
          if (j + 1 < M[i].length) {
              sum += M[i][j + 1];
              size++;
          }
          // up left
          if (i - 1 >= 0 && j - 1 >= 0) {
              sum += M[i - 1][j - 1];
              size++;
          }
          // up right
          if (i - 1 >= 0 && j + 1 < M[i - 1].length) {
              sum += M[i - 1][j + 1];
              size++;
          }
          // down left
          if (i + 1 < M.length && j - 1 >=0) {
              sum += M[i + 1][j - 1];
              size++;
          }
          // down right
          if (i + 1 < M.length && j + 1 < M[i + 1].length) {
              sum += M[i + 1][j + 1];
              size++;
          }
          ret[i][j] = (int) Math.floor(sum / size);
      }
  }
  return ret;
}