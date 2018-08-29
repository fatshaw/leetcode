@Test
public void testnumberOfArithmeticSlices() {
    assert 3 == numberOfArithmeticSlices(new int[]{1, 2, 3, 4});
    assert 2 == numberOfArithmeticSlices(new int[]{0, 2, 3, 4, 6, 8});
    assert 7 == numberOfArithmeticSlices(new int[]{0, 2, 3, 4, 5, 6, 9, 1, 2, 3});
}