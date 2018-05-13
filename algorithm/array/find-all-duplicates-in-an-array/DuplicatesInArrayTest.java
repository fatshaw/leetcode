@Test
public void testfindDuplicates() {
    assert 3 == findDuplicates(new int[]{1, 2, 4, 5, 3, 3}).get(0);
    assert 3 == findDuplicates(new int[]{1, 2, 4, 6, 3, 3}).get(0);
}