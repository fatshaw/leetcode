@Test
public void testadvantageCount() {
    assert Arrays.equals(advantageCount(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11}), new int[]{2, 11, 7, 15});
    assert Arrays.equals(advantageCount(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}), new int[]{4,3,2,1});
    assert Arrays.equals(advantageCount(new int[]{12, 24, 8, 32}, new int[]{13, 25, 32, 11}), new int[]{24, 32, 8, 12});
    assert Arrays.equals(advantageCount(new int[]{2, 0, 4, 1, 2}, new int[]{1, 3, 0, 0, 2}), new int[]{2, 4, 2, 1, 0});
}