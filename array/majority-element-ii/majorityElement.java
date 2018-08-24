public List<Integer> majorityElement(int[] nums) {
  int m1 = 0;
  int m2 = 0;
  int cm1 = 0;
  int cm2 = 0;
  for (int i : nums) {
      if (m1 == i) {
          cm1 += 1;
      } else if (m2 == i) {
          cm2 += 1;
      } else if (cm1 == 0) {
          m1 = i;
          cm1 = 1;
      } else if (cm2 == 0) {
          m2 = i;
          cm2 = 1;
      } else {
          cm1--;
          cm2--;
      }
  }
  List<Integer> results = new ArrayList<>();
  cm1 = 0;
  cm2 = 0;
  for (int i : nums) {
      if (i == m1) {
          cm1++;
      } else if (i == m2) {
          cm2++;
      }
  }
  if (cm1 > nums.length / 3) {
      results.add(m1);
  }
  if (cm2 > nums.length / 3) {
      results.add(m2);
  }
  return results;
}