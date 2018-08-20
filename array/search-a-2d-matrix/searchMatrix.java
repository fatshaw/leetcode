public boolean searchMatrix(int[][] matrix, int target) {
  int row = matrix.length;
  if (row == 0) {
      return false;
  }
  int cow = matrix[0].length;

  int l = 0;
  int r = row * cow - 1;
  while (l <= r) {
      int m = (l + r) / 2;
      if (matrix[m / cow][m % cow] == target) {
          return true;
      }
      if (matrix[m / cow][m % cow] > target) {
          r = m - 1;
      } else {
          l = m + 1;
      }
  }
  return false;
}