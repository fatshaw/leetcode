public int countNumbersWithUniqueDigits(int n) {
  if (n == 0) {
      return 1;
  }
  int count = 10;
  int base = 10;
  int unique = 9;
  while (n-- > 1) {
      unique *= (--base);
      count += unique;
  }
  return count;
}