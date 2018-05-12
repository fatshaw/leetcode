@Test
public void testSplitArrayLargestSum() {
    int[] numbers = new int[]{7, 2, 5, 10, 8, 3};
    assert 14 == splitArray(numbers, 3);

    numbers = new int[]{7, 2, 5, 10, 8};
    assert 18 == splitArray(numbers, 2);
}