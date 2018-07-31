@Test
public void testminPathSum() {
    assert 1 == minPathSum(new int[][]{
        {
            1
        }
    });

    assert 3 == minPathSum(new int[][]{
        {
            1, 2
        }
    });

    assert 7 == minPathSum(new int[][]{
        {
            1, 3, 1,
        },
        {
            1, 5, 1,
        },
        {
            4, 2, 1,
        }
    });
}
