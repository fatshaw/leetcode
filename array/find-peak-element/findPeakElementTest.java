@Test
public void testfindPeakElement() {
    assert 2 == findPeakElement(new int[]{1, 2, 3, 1});
    assert 1 == findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}) || 5 == findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
    assert 5 == findPeakElement(new int[]{1, 2, 3, 4, 5, 6});
    assert 0 == findPeakElement(new int[]{6, 5, 4, 3, 2, 1});
}