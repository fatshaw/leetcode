@Test
public void testsearchRange() {
    assert Arrays.equals(new int[]{0, 5}, searchRange(new int[]{1, 1, 1, 1, 1, 1}, 1));
    assert Arrays.equals(new int[]{3, 4}, searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    assert Arrays.equals(new int[]{3, 3}, searchRange(new int[]{5, 7, 7, 8, 10}, 8));
    assert Arrays.equals(new int[]{1, 2}, searchRange(new int[]{5, 7, 7, 8, 10}, 7));
    assert Arrays.equals(new int[]{-1, -1}, searchRange(new int[]{5, 7, 7, 8, 10}, 6));
}