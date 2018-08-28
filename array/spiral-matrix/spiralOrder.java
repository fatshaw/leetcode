public List<Integer> spiralOrder(int[][] matrix, int startX) {
  List<Integer> results = new ArrayList<>();
  int row = startX;
  int cow = startX;
  if (row < matrix.length - startX && cow < matrix[row].length - startX) {
      for (; cow < matrix[row].length - startX; cow++) {
          results.add(matrix[row][cow]);
      }
      cow--;
  }
  row++;
  if (row < matrix.length - startX && cow == matrix[row].length - startX - 1) {
      for (; row < matrix.length - startX; row++) {
          results.add(matrix[row][cow]);
      }
      row--;
  }
  cow--;
  if (row == matrix.length - startX - 1 && cow >= startX) {
      for (; cow >= startX; cow--) {
          results.add(matrix[row][cow]);
      }
      cow++;
  }
  row--;
  if (row > startX && cow == startX) {
      for (; row > startX; row--) {
          results.add(matrix[row][cow]);
      }
  }

  return results;
}


public List<Integer> spiralOrder(int[][] matrix) {
  List<Integer> results = new ArrayList<>();
  for (int i = 0; i < matrix.length; i++) {
      results.addAll(spiralOrder(matrix, i));
  }
  return results;
}