@Test
public void testsetZeroes() {
    int[][] matrix = new int[][]{
        {
            1, 1, 1
        },
        {
            1, 0, 1
        },
        {
            1, 1, 1
        }
    };
    setZeroes(matrix);
    int[][] expected = new int[][]{
        {
            1, 0, 1
        },
        {
            0, 0, 0
        },
        {
            1, 0, 1
        }
    };
    for (int i = 0; i < matrix.length; i++) {
        assert Arrays.equals(matrix[i], expected[i]);
    }

    matrix = new int[][]{
        {
            0, 1, 2, 0
        },
        {
            3, 4, 5, 2
        },
        {
            1, 3, 1, 5
        }
    };
    setZeroes(matrix);
    expected = new int[][]{
        {
            0, 0, 0, 0
        },
        {
            0, 4, 5, 0
        },
        {
            0, 3, 1, 0
        }
    };
    for (int i = 0; i < matrix.length; i++) {
        assert Arrays.equals(matrix[i], expected[i]);
    }

    matrix = new int[][]{
        {
            0, 1, 2, 0
        },
        {
            3, 4, -1, 2
        },
        {
            1, 3, 1, 5
        }
    };
    setZeroes(matrix);
    expected = new int[][]{
        {
            0, 0, 0, 0
        },
        {
            0, 4, -1, 0
        },
        {
            0, 3, 1, 0
        }
    };
    for (int i = 0; i < matrix.length; i++) {
        assert Arrays.equals(matrix[i], expected[i]);
    }

    matrix = new int[][]{
        {
            -1
        },
        {
            2
        },
        {
            3
        }
    };
    setZeroes(matrix);
    expected = new int[][]{
        {
            -1
        },
        {
            2
        },
        {
            3
        }
    };
    for (int i = 0; i < matrix.length; i++) {
        assert Arrays.equals(matrix[i], expected[i]);
    }

    matrix = new int[][]{
        {
            -1, -2, 4
        }
    };
    setZeroes(matrix);
    expected = new int[][]{
        {
            -1, -2, 4
        }
    };
    for (int i = 0; i < matrix.length; i++) {
        assert Arrays.equals(matrix[i], expected[i]);
    }
}