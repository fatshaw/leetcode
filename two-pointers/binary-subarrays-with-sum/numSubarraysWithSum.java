public int numSubarraysWithSum(int[] A, int S) {
  int[] prefix = new int[A.length + 1];
  prefix[0] = 1;
  int cs = 0;
  int length = 0;
  for (int i = 0; i < A.length; i++) {
      cs += A[i];
      if (cs >= S) {
          length += prefix[cs - S];
      }
      prefix[cs]++;
  }
  return length;
}