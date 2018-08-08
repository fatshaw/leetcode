public int maximumSwap(int num) {
  char[] chars = Integer.valueOf(num).toString().toCharArray();
  int[] last = new int[10];
  for (int i = 0; i < chars.length; i++) {
      last[chars[i] - '0'] = i;
  }

  for (int i = 0; i < chars.length; i++) {
      for (int d = 9; d > chars[i] - '0'; d--) {
          if (last[d] > i) {
              int t = last[d];
              char tmp = chars[t];
              chars[t] = chars[i];
              chars[i] = tmp;
              return Integer.valueOf(String.valueOf(chars));
          }
      }
  }
  return num;
}