@Test
public void testintersection() {
    assert Arrays.equals(intersection(new int[]{1, 2, 3}, new int[]{1, 2}), new int[]{1, 2});
    assert Arrays.equals(intersection(new int[]{1,2,2,1}, new int[]{2, 2}), new int[]{2});
}