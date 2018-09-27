@Test
public void testcombinationSum4() {
    assert combinationSum4(new int[]{1, 2, 3}, 4) == 7;
    assert combinationSum4(new int[]{1, 2, 4}, 4) == 6;
    assert combinationSum4(new int[]{1}, 1) == 1;
    assert combinationSum4(new int[]{}, 1) == 0;
    assert combinationSum4(new int[]{3}, 4) == 0;
}