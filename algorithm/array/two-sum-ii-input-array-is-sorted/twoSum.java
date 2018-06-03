public int[] twoSum(int[] numbers, int target) {
  int l = 0;
  int r = numbers.length - 1;
  int[] ret = new int[2];
  while (l < r) {
      if (numbers[l] + numbers[r] == target) {
          ret[0] = l + 1;
          ret[1] = r + 1;
          break;
      }
      if (numbers[l] + numbers[r] > target) {
          r--;
      } else if (numbers[l] + numbers[r] < target) {
          l++;
      }
  }
  return ret;
}