@Test
public void testtriangleNumber() {
    assert 0 == triangleNumber(new int[]{0, 1, 0});
    assert 1 == triangleNumber(new int[]{0, 1, 1, 1});

    assert 0 == triangleNumber(new int[]{1, 2, 3});
    assert 1 == triangleNumber(new int[]{1, 2, 2});
    assert 3 == triangleNumber(new int[]{2, 2, 3, 4});
    assert 36 == triangleNumber(new int[]{34, 75, 96, 10, 60, 70, 70, 45});
    assert 65 == triangleNumber(new int[]{66, 99, 36, 44, 26, 99, 32, 64, 19, 69});
    assert 3 == triangleNumber(new int[]{2, 5, 6, 7});

}
