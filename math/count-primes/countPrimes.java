public int countPrimes(int n) {
  int count = 0;
  boolean[] notPrimes = new boolean[n];
  for (int i = 2; i < n; i++) {
      if (notPrimes[i] == false) {
          count++;
          for (int k = 2; i * k < n; k++) {
              notPrimes[i * k] = true;
          }
      }
  }
  return count;
}