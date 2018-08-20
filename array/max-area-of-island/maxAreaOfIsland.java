private int findGround(int[][] grid, int r, int c, int[][] visited) {
  Stack<int[]> stack = new Stack<>();
  stack.push(new int[]{r, c});
  int size = 1;
  while (stack.size() > 0) {
      int[] item = stack.pop();
      r = item[0];
      c = item[1];
      if (r - 1 >= 0 && visited[r - 1][c] == 0 && grid[r - 1][c] == 1) {
          stack.push(new int[]{r - 1, c});
          visited[r - 1][c] = 1;
          size++;
      }
      if (r + 1 < grid.length && visited[r + 1][c] == 0 && grid[r + 1][c] == 1) {
          stack.push(new int[]{r + 1, c});
          visited[r + 1][c] = 1;
          size++;
      }
      if (c - 1 >= 0 && visited[r][c - 1] == 0 && grid[r][c - 1] == 1) {
          stack.push(new int[]{r, c - 1});
          visited[r][c - 1] = 1;
          size++;
      }
      if (c + 1 < grid[r].length && visited[r][c + 1] == 0 && grid[r][c + 1] == 1) {
          stack.push(new int[]{r, c + 1});
          visited[r][c + 1] = 1;
          size++;
      }
  }
  return size;
}

public int maxAreaOfIsland(int[][] grid) {
  int[][] visited = new int[grid.length][grid[0].length];
  int max = 0;
  for (int i = 0; i < grid.length; ++i) {
      for (int j = 0; j < grid[i].length; ++j) {
          if (visited[i][j] == 0) {
              visited[i][j] = 1;
              if (grid[i][j] == 1) {
                  max = Math.max(findGround(grid, i, j, visited), max);
              }
          }
      }
  }
  return max;
}