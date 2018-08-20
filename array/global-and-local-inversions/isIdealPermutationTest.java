@Test
public void testisIdealPermutation() {
    assert isIdealPermutation(new int[]{1, 0, 2});
    assert !isIdealPermutation(new int[]{1, 2, 0});
    assert !isIdealPermutation(new int[]{2, 1, 0});
    assert isIdealPermutation(new int[]{0, 1, 2, 3, 4});
}