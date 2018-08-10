@Test
public void testminimumTotal() {
    List<List<Integer>> triangle = new ArrayList<>();
    int[][] array = new int[][]{
        {
            2
        },
        {
            3, 4
        },
        {
            6, 5, 7
        },
        {
            4, 1, 8, 3
        }
    };
    for (int[] a : array) {
        List<Integer> l = IntStream.of(a).boxed().collect(Collectors.toList());
        triangle.add(l);
    }
    assert 11 == minimumTotal(triangle);

    triangle = new ArrayList<>();
    array = new int[][]{
        {
            1
        },
        {
            2, 3
        },
        {
            4, 5, 6
        },
        {
            18, 15, 9, 10
        }
    };
    for (int[] a : array) {
        List<Integer> l = IntStream.of(a).boxed().collect(Collectors.toList());
        triangle.add(l);
    }
    assert 17 == minimumTotal(triangle);
}