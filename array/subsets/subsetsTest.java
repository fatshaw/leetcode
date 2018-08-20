@Test
public void testcNm() {
    List<List<Integer>> results = subsets(new int[]{1, 2, 3});
    assert results.size() == 8;
    for (List<Integer> r : results) {
        System.out.println(r);
    }
}