@Test
public void testfindUnsortedSubarray() {
    assert 5 == findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15});
    assert 0 == findUnsortedSubarray(new int[]{1, 2, 3});
    assert 4 == findUnsortedSubarray(new int[]{2, 5, 4, 1, 7});
    assert 5 == findUnsortedSubarray(new int[]{3, 3, 3, 3, 1});
    assert 2 == findUnsortedSubarray(new int[]{1, 3, 2, 3, 3});
}