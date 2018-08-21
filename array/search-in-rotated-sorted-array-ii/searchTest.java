Test
public void testsearch() {
    assert search(new int[]{1}, 1);
    assert search(new int[]{1, 3, 1, 1, 1}, 3);
    assert search(new int[]{2, 2, 2, 2, 2, 3, 1, 1, 1}, 3);
    assert search(new int[]{2, 2, 2, 2, 2, 3, 1, 1, 1}, 1);
    assert search(new int[]{2, 2, 2, 2, 2, 3, 1, 1, 1}, 2);
    assert search(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        2);
}