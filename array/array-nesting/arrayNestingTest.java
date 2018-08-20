@Test
public void testarrayNesting() {
    assert 4 == arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2});
    assert 2 == arrayNesting(new int[]{0, 2, 1});
}