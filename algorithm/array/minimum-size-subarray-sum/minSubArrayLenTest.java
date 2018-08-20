@Test
public void testminSubArrayLen() {
    assert 2 == minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
    assert 1 == minSubArrayLen(8, new int[]{2, 3, 5, 1, 8, 11, 2});
    assert 0 == minSubArrayLen(8, new int[]{1,1});
    assert 4 == minSubArrayLen(10, new int[]{1,2,3,4});
}