@Test
public void testpermute() {
    List<List<Integer>> results = permuteUnique(new int[]{1, 1, 2});
    assert results.size() == 3;
    for (List<Integer> r : results) {
        System.out.println(r);
    }
}
