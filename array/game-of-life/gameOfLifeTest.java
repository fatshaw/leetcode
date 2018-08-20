@Test
public void testgameOfLife() {
    int[][] t = new int[][]{
        {0, 1, 0},
        {0, 0, 1},
        {1, 1, 1},
        {0, 0, 0},
    };
    gameOfLife(t);
    int[][] ex = new int[][]{
        {0, 0, 0},
        {1, 0, 1},
        {0, 1, 1},
        {
            0, 1, 0
        }
    };
    for (int i = 0; i < t.length; i++) {
        assert Arrays.equals(t[i], ex[i]);
    }

    t = new int[][]{
        {0, 1, 1},
        {0, 1, 1},
        {1, 1, 1},
        {0, 0, 0},
    };
    gameOfLife(t);
    ex = new int[][]{
        {0, 1, 1},
        {0, 0, 0},
        {1, 0, 1},
        {0, 1, 0}
    };
    for (int i = 0; i < t.length; i++) {
        assert Arrays.equals(t[i], ex[i]);
    }
}