@Test
public void testmajorityElement2() {
    assert majorityElement2(new int[]{1, 2, 3, 1, 2, 3, 3}).equals(Arrays.asList(3));
    assert majorityElement2(new int[]{1, 1, 1, 3, 3, 2, 2, 2}).equals(Arrays.asList(1, 2));
    assert majorityElement2(new int[]{1, 2, 3, 4, 1, 2, 1}).equals(Arrays.asList(1));
    assert majorityElement2(new int[]{1, 2, 2, 3, 2, 1, 1, 3}).equals(Arrays.asList(1,2));
}