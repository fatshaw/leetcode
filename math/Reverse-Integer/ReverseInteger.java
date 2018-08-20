public int reverse(int x) {
  int isNegative = (x < 0 ? -1 : 1);
  long result = 0;
  while (x != 0) {
      result = (x % 10) + result * 10;
      x = x / 10;
      if (isNegative == -1 && result < Integer.MIN_VALUE) {
          return 0;
      } else if (isNegative == 1 && result > Integer.MAX_VALUE) {
          return 0;
      }
  }
  return (int) result;
}