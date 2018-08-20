@Test
public void testmaxSubArray() {
    assert maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) == 6;
    assert maxSubArray(new int[]{-2}) == -2;
}