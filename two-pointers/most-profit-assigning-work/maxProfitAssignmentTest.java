@Test
public void testmaxProfitAssignment() {
    assert
        100 == maxProfitAssignment(new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50}, new int[]{4, 5, 6, 7});
    assert 50 == maxProfitAssignment(new int[]{3, 4, 5}, new int[]{10, 20, 30}, new int[]{4, 5});
    assert 40 == maxProfitAssignment(new int[]{3, 4, 6}, new int[]{10, 20, 30}, new int[]{4, 5});
    assert 142 == maxProfitAssignment(new int[]{7, 20, 68}, new int[]{26, 28, 57}, new int[]{71, 20, 71});
    assert 0 == maxProfitAssignment(new int[]{7, 20, 68}, new int[]{26, 28, 57}, new int[]{1, 1, 1});
    assert 324 == maxProfitAssignment(new int[]{68, 35, 52, 47, 86}, new int[]{67, 17, 1, 81, 3},
        new int[]{92, 10, 85, 84, 82});

    // diffrent profit for the job with equal difficulties
    assert 1392 == maxProfitAssignment(
        new int[]{66, 1, 28, 73, 53, 35, 45, 60, 100, 44, 59, 94, 27, 88, 7, 18, 83, 18, 72, 63},
        new int[]{66, 20, 84, 81, 56, 40, 37, 82, 53, 45, 43, 96, 67, 27, 12, 54, 98, 19, 47, 77},
        new int[]{61, 33, 68, 38, 63, 45, 1, 10, 53, 23, 66, 70, 14, 51, 94, 18, 28, 78, 100, 16});
}