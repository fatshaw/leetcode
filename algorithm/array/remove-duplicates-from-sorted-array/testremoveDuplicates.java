public void testremoveDuplicates() {
  assert removeDuplicates(new int[]{1, 1, 2}) == 2;
  assert removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}) == 5;
}