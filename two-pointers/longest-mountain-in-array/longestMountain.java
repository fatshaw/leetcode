public int longestMountain(int[] A) {
  int low;
  int preLow = Integer.MAX_VALUE;
  int length = 0;
  for (int i = 1; i < A.length; i++) {
      if (A[i - 1] < A[i] && (i == 1 || A[i - 1] <= A[i - 2])) {
          preLow = i - 1;
      } else if (A[i] < A[i - 1]) {
          low = i;
          length = Math.max(length, low - preLow + 1);
      } else if (A[i] == A[i - 1]) {
          preLow = Integer.MAX_VALUE;
      }
  }
  return length;
}