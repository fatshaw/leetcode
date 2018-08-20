public long findMultiply(long dividend, long divisor) {

  if (dividend < divisor) {
      return 0;
  }

  long sum = divisor;
  long result = 1;
  while ((sum + sum) <= dividend) {
      result += result;
      sum += sum;
  }
  return result + findMultiply(dividend - sum, divisor);
}

public int divide(int dividend, int divisor) {
  long result = 0;
  long ldividend = dividend;
  long ldivisor = divisor;
  boolean isNegative = false;

  if (ldividend > 0 && ldivisor > 0) {
      isNegative = false;
      result = findMultiply(ldividend, ldivisor);
  } else if (ldividend < 0 && ldivisor < 0) {
      isNegative = false;
      result = findMultiply(Math.abs(ldividend), Math.abs(ldivisor));
  } else if (ldividend > 0 && ldivisor < 0) {
      isNegative = true;
      result = findMultiply(Math.abs(ldividend), Math.abs(ldivisor));
  } else if (ldividend < 0 && ldivisor > 0) {
      isNegative = true;
      result = findMultiply(Math.abs(ldividend), Math.abs(ldivisor));
  }

  result = isNegative ? -result : result;

  if (result > Integer.MAX_VALUE) {
      result = Integer.MAX_VALUE;
  }

  return (int) result;
}