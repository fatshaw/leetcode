@Test
public void testcombinationSum3() {
    List<List<Integer>> result = combinationSum3(1, 1);
    for (List<Integer> r : result) {
        System.out.println(r);
    }
    assert result.size() == 1;
    assert result.get(0).equals(Arrays.asList(1));

    result = combinationSum3(2, 3);
    for (List<Integer> r : result) {
        System.out.println(r);
    }
    assert result.size() == 1;
    assert result.get(0).equals(Arrays.asList(1, 2));

    result = combinationSum3(2, 5);
    for (List<Integer> r : result) {
        System.out.println(r);
    }
    assert result.size() == 2;
    assert result.get(0).equals(Arrays.asList(1, 4));
    assert result.get(1).equals(Arrays.asList(2, 3));

    result = combinationSum3(3, 9);
    for (List<Integer> r : result) {
        System.out.println(r);
    }
    assert result.size() == 3;
    assert result.get(0).equals(Arrays.asList(1, 2, 6));
    assert result.get(1).equals(Arrays.asList(1, 3, 5));
    assert result.get(2).equals(Arrays.asList(2, 3, 4));

    result = combinationSum3(4, 16);
    for (List<Integer> r : result) {
        System.out.println(r);
    }
    assert result.size() == 8;
    assert result.get(0).equals(Arrays.asList(1, 2, 4, 9));
    assert result.get(1).equals(Arrays.asList(1, 2, 5, 8));
    assert result.get(2).equals(Arrays.asList(1, 2, 6, 7));
    assert result.get(3).equals(Arrays.asList(1, 3, 4, 8));
    assert result.get(4).equals(Arrays.asList(1, 3, 5, 7));
    assert result.get(5).equals(Arrays.asList(1, 4, 5, 6));
    assert result.get(6).equals(Arrays.asList(2, 3, 4, 7));
    assert result.get(7).equals(Arrays.asList(2, 3, 5, 6));

    result = combinationSum3(2, 16);
    for (List<Integer> r : result) {
        System.out.println(r);
    }
    assert result.size() == 1;
    assert result.get(0).equals(Arrays.asList(7, 9));
}