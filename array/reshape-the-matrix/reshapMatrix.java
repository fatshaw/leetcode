public int[][] matrixReshape(int[][] nums, int r, int c) {
  if (nums[0].length * nums.length != r * c) {
      return nums;
  }

  int[][] ret = new int[r][c];
  int size = 0;
  for (int[] rows : nums) {
      for (int v : rows) {
          ret[size / c][size % c] = v;
          size++;
      }
  }
  return ret;
}