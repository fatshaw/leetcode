@Test
public void testCombinationSum() {
    List<List<Integer>> results = combinationSum(new int[]{1, 2, 3}, 3);
    assert results.size() == 3;
    for (List<Integer> r : results) {
        System.out.println(r);
    }

    results = combinationSum(new int[]{2, 3, 6, 7}, 7);
    assert results.size() == 2;
    for (List<Integer> r : results) {
        System.out.println(r);
    }

    results = combinationSum(new int[]{2, 3, 5}, 8);
    assert results.size() == 3;
    for (List<Integer> r : results) {
        System.out.println(r);
    }
}