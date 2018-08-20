public boolean checkPossibility(int[] nums) {
  int p = -1;
  for (int i = 1; i < nums.length; ++i) {
      if (nums[i] < nums[i - 1]) {
          if (p != -1) {
              return false;
          }
          p = i - 1;
      }
  }
  return p == -1 || p == 0 || p == nums.length - 2 ||
      nums[p + 1] > nums[p - 1] || nums[p + 2] > nums[p];
}

@Test
public void testcheckPossibility(){
    assert checkPossibility(new int[]{4,2,3});
    assert checkPossibility(new int[]{1,2,3});
    assert !checkPossibility(new int[]{4,2,1});
}