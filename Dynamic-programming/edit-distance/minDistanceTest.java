@Test
public void testminDistance() {
    assert 1 == minDistance("", "a");
    assert 0 == minDistance("", "");
    assert 1 == minDistance("a", "");

    assert 0 == minDistance("a", "a");
    assert 1 == minDistance("a", "b");
    assert 1 == minDistance("ab", "a");
    assert 3 == minDistance("horse", "ros");
    assert 5 == minDistance("intention", "execution");
}
