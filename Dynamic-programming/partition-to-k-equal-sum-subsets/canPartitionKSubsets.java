public boolean canPartitionKSubsets(int[] nums, int k) {
  int sum = 0;
  for (int number : nums) {
      sum += number;
  }
  if (sum % k != 0) {
      return false;
  }

  int[] visited = new int[nums.length];
  return partition(nums, visited, 0, k, 0, sum / k);
}

public boolean partition(int[] numbers, int[] visited, int startIndex, int numOfSub, int curSum, int target) {
  if (numOfSub == 1) {
      return true;
  }
  if (curSum == target) {
      return partition(numbers, visited, 0, numOfSub - 1, 0, target);
  }
  if (curSum > target) {
      return false;
  }

  for (int i = startIndex; i < numbers.length; ++i) {
      if (visited[i] == 0) {
          visited[i] = 1;
          if (partition(numbers, visited, i + 1, numOfSub, curSum + numbers[i], target)) {
              return true;
          }
          visited[i] = 0;
      }
  }
  return false;
}