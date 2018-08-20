@Test
public void testnumSubarrayBoundedMax() {
    assert 0 == numSubarrayBoundedMax(new int[]{1}, 0, 0);
    assert 1 == numSubarrayBoundedMax(new int[]{1}, 0, 1);
    assert 1 == numSubarrayBoundedMax(new int[]{1, 2}, 0, 1);
    assert 4 == numSubarrayBoundedMax(new int[]{1, 2, 0, 1}, 0, 1);
    assert 3 == numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3);
    assert 7 == numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8);
}