@Test
public void testnumSubarraysWithSum() {
    assert 6 == subarraySum(new int[]{0, 0, 1, 0, 1, 0}, 2);
    assert 10 == subarraySum(new int[]{0, 1, 0, 1, 0, 0, 1, 0}, 2);
    assert 4 == subarraySum(new int[]{1, 0, 1, 0, 1}, 2);
    assert 0 == subarraySum(new int[]{0, 0, 0}, 2);
    assert 3 == subarraySum(new int[]{1, 1, 1, 1}, 2);
    assert 5 == subarraySum(new int[]{1, 1, 0, 1, 1}, 2);
    assert 9 == subarraySum(new int[]{0, 0, 1, 0, 0, 0}, 0);
}