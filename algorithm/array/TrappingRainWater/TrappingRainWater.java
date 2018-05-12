public int trap(int[] height) {
  int leftMax = 0;
  int rightMax = 0;
  int left = 0;
  int right = height.length - 1;
  int total = 0;
  while (left < right) {
      leftMax = Math.max(height[left], leftMax);
      rightMax = Math.max(height[right], rightMax);
      if (leftMax <= rightMax) {
          total += leftMax;
          total -= height[left];
          left++;
      } else {
          total += rightMax;
          total -= height[right];
          right--;
      }
  }
  return total;
}