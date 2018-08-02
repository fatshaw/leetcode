@Test
public void testfindMin() {
    assert 1 == findMin(new int[]{1});
    assert 1 == findMin(new int[]{1, 2});
    assert 1 == findMin(new int[]{1, 2, 3});

    assert 1 == findMin(new int[]{3, 4, 5, 1, 2});
    assert 0 == findMin(new int[]{4, 5, 6, 7, 0, 1, 2});
    assert 0 == findMin(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    assert 0 == findMin(new int[]{3, 4, 5, 0, 1, 2});
}