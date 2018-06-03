public boolean isOneBitCharacter(int[] bits) {
  int i = 0;
  while (i < bits.length - 1) {
      i += bits[i] + 1;
  }
  if (i >= bits.length) {
      return false;
  }
  return true;
}