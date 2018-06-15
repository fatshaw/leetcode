@Test
public void testpivotIndex() {
    assert pivotIndex(new int[]{1, 7, 3, 6, 5, 6}) == 3;
    assert pivotIndex(new int[]{1, 2, 3}) == -1;
    assert pivotIndex(new int[]{-1, -1, -1, 0, 1, 1}) == 0;
}