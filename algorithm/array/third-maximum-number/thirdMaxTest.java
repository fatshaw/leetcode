@Test
public void testthirdMax() {
    assert thirdMax(new int[]{1, 2, 3}) == 1;
    assert thirdMax(new int[]{1, 2}) == 2;
    assert thirdMax(new int[]{2, 2, 3, 1}) == 1;
    assert thirdMax(new int[]{2, 1, Integer.MIN_VALUE}) == Integer.MIN_VALUE;
}