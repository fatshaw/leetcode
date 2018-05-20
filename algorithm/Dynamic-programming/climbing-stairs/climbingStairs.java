public int climbStairs(int n) {
  if (n == 1) {
      return 1;
  }
  if (n == 2) {
      return 2;
  }

  int count = 1;
  int count1 = 1;
  int count2 = 2;

  for (int i = 3; i <= n; i++) {
      count = count1 + count2;
      count1 = count2;
      count2 = count;
  }
  
  return count;
}