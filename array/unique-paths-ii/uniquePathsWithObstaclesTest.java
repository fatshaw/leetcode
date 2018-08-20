@Test
public void testuniquePathsWithObstacles() {
    assert 2 == uniquePathsWithObstacles(new int[][]{
        {
            0, 0, 0
        },
        {
            0, 1, 0
        },
        {
            0, 0, 0
        }
    });

    assert 1 == uniquePathsWithObstacles(new int[][]{
        {
            0, 1, 0
        },
        {
            0, 1, 0
        },
        {
            0, 0, 0
        }
    });

    assert 0 == uniquePathsWithObstacles(new int[][]{
        {
            0, 1, 0
        },
        {
            1, 1, 0
        },
        {
            0, 0, 0
        }
    });

    assert 0 == uniquePathsWithObstacles(new int[][]{
        {
            0, 1, 0
        },
        {
            1, 1, 0
        },
        {
            0, 0, 1
        }
    });
}