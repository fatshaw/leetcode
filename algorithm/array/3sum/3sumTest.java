@Test
public void testthreeSum() {
    assert threeSum(new int[]{-1, 0, 1}).size() == 1;
    assert 0 == threeSum(new int[]{-1, 0, 1}).get(0).stream().reduce(Integer::sum).get();
    assert threeSum(new int[]{-1, 0, 0, 1, 2, -1}).size() == 2;
}