@Test
public void testRotate() {

    int[][] matrix = new int[][]{
        {1, 2}, {3, 4}
    };
    rotate(matrix);
    for (int[] s : matrix) {
        for (int j : s) {
            System.out.print(j);
        }
        System.out.println();
    }

    matrix = new int[][]{
        {
            1, 2, 3
        },
        {
            4, 5, 6
        },
        {
            7, 8, 9
        }
    };
    rotate(matrix);
    for (int[] s : matrix) {
        for (int j : s) {
            System.out.print(j);
        }
        System.out.println();
    }

    matrix = new int[][]{
        {
            5, 1, 9, 11
        },
        {
            2, 4, 8, 10
        },
        {
            13, 3, 6, 7
        },
        {
            15, 14, 12, 16
        }
    };
    rotate(matrix);
    for (int[] s : matrix) {
        for (int j : s) {
            System.out.print(j);
        }
        System.out.println();
    }

}