@Test
public void testsearch() {
    assert 0 == search(new int[]{1}, 1);
    assert 1 == search(new int[]{1, 2}, 2);
    assert -1 == search(new int[]{1, 2, 4, 5, 6, 0}, -1);
    assert 4 == search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    assert -1 == search(new int[]{4, 5, 6, 7, 0, 1, 2}, 9);
    assert 0 == search(new int[]{9, 1, 2, 4, 6}, 9);
    assert 1 == search(new int[]{9, 1, 2, 4, 6}, 1);
    assert -1 == search(new int[]{5, 1, 2, 3, 4}, 12);
}