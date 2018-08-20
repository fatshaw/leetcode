@Test
public void testnumSubarrayProductLessThanK() {
  assert 4 == numSubarrayProductLessThanK(new int[]{1, 2, 3}, 5);
  assert 0 == numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0);
  assert 8 == numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
}