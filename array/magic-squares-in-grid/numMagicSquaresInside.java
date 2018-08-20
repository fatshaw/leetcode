private boolean magicSquare(int i, int j, int[][] grid) {
  int[] distinctNumbers = new int[9];
  if (i + 2 < grid.length && j + 2 < grid[i].length) {
      for (int x = 0; x < 3; x++) {
          for (int y = 0; y < 3; y++) {
              if (0 < grid[i + x][j + y] && grid[i + x][j + y] < 10) {
                  distinctNumbers[grid[i + x][j + y] - 1] += 1;
              }

          }
      }
      for (int x = 0; x < distinctNumbers.length; x++) {
          if (distinctNumbers[x] != 1) {
              return false;
          }
      }

      if (grid[i][j] + grid[i][j + 1] + grid[i][j + 2] != 15
          || grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2] != 15
          || grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2] != 15
          || grid[i][j] + grid[i + 1][j] + grid[i + 2][j] != 15
          || grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1] != 15
          || grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2] != 15
          || grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2] != 15
          || grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] != 15) {
          return false;
      }

      return true;
  }

  return false;
}

public int numMagicSquaresInside(int[][] grid) {
  int count = 0;
  for (int i = 0; i < grid.length; ++i) {
      for (int j = 0; j < grid[i].length - 2; ++j) {
          count += magicSquare(i, j, grid) ? 1 : 0;
      }
  }
  return count;
}