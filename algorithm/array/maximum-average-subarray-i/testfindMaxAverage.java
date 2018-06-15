@Test
public void testfindMaxAverage() {
    assert findMaxAverage(new int[]{1, 2, 3, 4}, 2) == 3.5;
    assert findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4) == 12.75;
}