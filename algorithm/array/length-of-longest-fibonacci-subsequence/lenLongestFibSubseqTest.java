@Test
public void testlenLongestFibSubseq() {
    assert 3 == lenLongestFibSubseq(new int[]{1, 2, 3});
    assert 3 == lenLongestFibSubseq(new int[]{1, 2, 3, 4});
    assert 5 == lenLongestFibSubseq(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    assert 3 == lenLongestFibSubseq(new int[]{1, 3, 7, 11, 12, 14, 18});
    assert 7 == lenLongestFibSubseq(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 18, 19, 29});
    assert 5 == lenLongestFibSubseq(new int[]{2, 4, 7, 8, 9, 10, 14, 15, 18, 23, 32, 50});
    assert 5 == lenLongestFibSubseq(new int[]{2, 4, 7, 8, 9, 10, 14, 15, 18, 23, 32, 50});
}