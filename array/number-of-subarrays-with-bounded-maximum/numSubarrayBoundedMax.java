public int numSubarrayBoundedMax(int[] A, int L, int R) {
  int count = 0;
  int prev = -1;
  int dp = 0;
  for (int i = 0; i < A.length; i++) {
      if (A[i] > R) {
          prev = i;
          dp = 0;
      }
      if (A[i] < L) {
          count += dp;
      }
      if (L <= A[i] && A[i] <= R) {
          dp = i - prev;
          count += dp;
      }
  }

  return count;
}