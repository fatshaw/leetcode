@Test
public void testmaxProduct() {
    assert 6 == maxProduct(new int[]{1, 2, 3});
    assert 6 == maxProduct(new int[]{2, 3, -2, 4});
    assert 0 == maxProduct(new int[]{-2, 0, -1});
    assert 24 == maxProduct(new int[]{-2, 12, -1});
    assert 0 == maxProduct(new int[]{-2, 0, -1});
    assert -2 == maxProduct(new int[]{-2});
    assert 2 == maxProduct(new int[]{2});
    assert 8 == maxProduct(new int[]{1, -2, 2, -2, -2, 1});
    assert 16 == maxProduct(new int[]{1, -2, -2, -2, -2, 1});
    assert 4 == maxProduct(new int[]{1, -2, -2, 0, -2, 1});
}