@Test
public void testfindKthLargest() {
    assert 6 == findKthLargest(new int[]{1, 2, 4, 5, 6}, 1);
    assert 6 == findKthLargest(new int[]{1, 2, 10, 5, 6}, 2);
    assert 1 == findKthLargest(new int[]{1, 1}, 1);
}