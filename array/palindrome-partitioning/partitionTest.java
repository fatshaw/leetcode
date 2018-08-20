@Test
public void testpartition() {
    List<List<String>> results = partition("aab");
    for (List<String> r : results) {
        System.out.println(r);
    }
    assert results.size() == 2;
}