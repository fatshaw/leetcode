@Test
public void longestMountain() {
    assert 5 == longestMountain(new int[]{1, 2, 1, 0, 2, 3, 4, 3});
    assert 3 == longestMountain(new int[]{1, 3, 2});
    assert 3 == longestMountain(new int[]{2, 1, 3, 2, 3});
    assert 5 == longestMountain(new int[]{2, 1, 4, 7, 3, 2, 5});
    assert 0 == longestMountain(new int[]{2, 2, 2});
    assert 0 == longestMountain(new int[]{3, 2, 1});
    assert 0 == longestMountain(new int[]{3, 3, 1});
    assert 3 == longestMountain(new int[]{1, 1, 0, 0, 1, 0});
}