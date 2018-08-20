@Test
public void testFourSum() {
    assert fourSum(new int[]{-1, 0, 1, 0}, 0).size() == 1;
    assert 0 == fourSum(new int[]{-1, 0, 1, 0}, 0).get(0).stream().reduce(Integer::sum).get();
    assert fourSum(new int[]{-1, 0, 1, 2}, 2).size() == 1;
    assert fourSum(new int[]{-2, 0, 0, -1, 1, 2}, 0).size() == 3;
}