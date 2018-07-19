@Test
public void testUniquePaths() {
    assert 1 == uniquePaths(1, 1);
    assert 1 == uniquePaths(2, 1);
    assert 1 == uniquePaths(3, 1);
    assert 3 == uniquePaths(3, 2);
    assert 28 == uniquePaths(7, 3);
}