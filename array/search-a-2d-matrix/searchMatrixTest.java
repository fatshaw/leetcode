@Test
public void testsearchMatrix() {
    assert searchMatrix(new int[][]{
        {
            1, 3, 5, 7
        }, {
        10, 11, 16, 20
    }, {
        23, 30, 34, 50
    }
    }, 3);

    assert !searchMatrix(new int[][]{
        {
            1, 3, 5, 7
        }, {
        10, 11, 16, 20
    }, {
        23, 30, 34, 50
    }
    }, 13);
}