@Test
public void testSubsetsWithDup() {
    List<List<Integer>> results = subsetsWithDup(new int[]{1, 2, 3});
    assert results.size() == 8;
    for (List<Integer> r : results) {
        System.out.println(r);
    }

    results = subsetsWithDup(new int[]{1,2,2});
    for (List<Integer> r : results) {
        System.out.println(r);
    }
    assert results.size() == 6;
}