@Test
public void testfindPairs() {
    assert findPairs(new int[]{3, 1, 4, 1, 5}, 2) == 2;
    assert findPairs(new int[]{1, 2, 3, 4, 5}, 1) == 4;
    assert findPairs(new int[]{1, 3, 1, 5, 4}, 0) == 1;
}