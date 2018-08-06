@Test
public void testsubarraySum() {
    assert 2 == subarraySum(new int[]{1, 1, 1}, 2);
    assert 5 == subarraySum(new int[]{1, 1, 1, -1, 2}, 2);
}