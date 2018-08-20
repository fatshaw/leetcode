@Test
public void testfindLength() {
    assert 2 == findLength(new int[]{1, 2, 3}, new int[]{3, 1, 2});
    assert 1 == findLength(new int[]{1, 2, 3}, new int[]{3, 2, 1});
    assert 1 == findLength(new int[]{1, 2, 3}, new int[]{1});
    assert 3 == findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7});
    assert 2 == findLength(new int[]{0, 1, 1,1,1}, new int[]{1, 0, 1,0,1});
}