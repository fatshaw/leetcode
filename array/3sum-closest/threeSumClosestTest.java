@Test
public void testthreeSumClosest() {
    assert 2 == threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
    assert 6 == threeSumClosest(new int[]{1, 2, 3, 4, 5}, 3);
    assert 12 == threeSumClosest(new int[]{1, 2, 3, 4, 5}, 12);
}