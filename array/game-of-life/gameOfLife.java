public void gameOfLife(int[][] board) {
  for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
          int count = 0;
          for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, board.length - 1); x++) {
              for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, board[i].length - 1); y++) {
                  if (x == i && y == j) {
                      continue;
                  }
                  if (board[x][y] == 1) {
                      count += 1;
                  }
                  if (board[x][y] == 3) {
                      count += 1;
                  }
              }
          }

          if (board[i][j] == 1 && (count < 2 || count > 3)) {
              board[i][j] = 3;
          }
          if (board[i][j] == 0 && count == 3) {
              board[i][j] = 2;
          }
      }
  }
  for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
          if (board[i][j] == 2) {
              board[i][j] = 1;
          }
          if (board[i][j] == 3) {
              board[i][j] = 0;
          }
      }
  }
}