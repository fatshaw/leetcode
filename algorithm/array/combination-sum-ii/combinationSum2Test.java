@Test
public void testCombinationSum2() {
    List<List<Integer>> results = combinationSum2(new int[]{1, 2, 3}, 3);
    for (List<Integer> r : results) {
        System.out.println(r);
    }
    assert results.size() == 2;

    results = combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    for (List<Integer> r : results) {
        System.out.println(r);
    }
    assert results.size() == 4;
}