@Test
public void testcontainsNearbyDuplicate() {
    assert containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
    assert containsNearbyDuplicate(new int[]{1, 0, 0, 1, 1, 1}, 2);
    assert !containsNearbyDuplicate(new int[]{1, 0, 2, 3, 1}, 2);
    assert !containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
}