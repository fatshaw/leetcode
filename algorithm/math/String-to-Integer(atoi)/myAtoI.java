public int myAtoi(String str) {
  char[] chars = str.trim().toCharArray();
  if (chars.length == 0) {
      return 0;
  }

  if (chars[0] != '-' && chars[0] != '+' && (chars[0] < '0' || chars[0] > '9')) {
      return 0;
  }

  int isNegative = (chars[0] == '-' ? -1 : 1);
  boolean isSigned = (chars[0] == '-' || chars[0] == '+');
  long result = 0;
  for (int i = (isSigned ? 1 : 0); i < chars.length; ++i) {
      if (chars[i] >= '0' && chars[i] <= '9') {
          result = (chars[i] - '0') * isNegative + result * 10;
          if (isNegative == -1 && result < Integer.MIN_VALUE) {
              return Integer.MIN_VALUE;
          } else if (isNegative == 1 && result > Integer.MAX_VALUE) {
              return Integer.MAX_VALUE;
          }
      } else {
          break;
      }
  }
  return (int) result;
}