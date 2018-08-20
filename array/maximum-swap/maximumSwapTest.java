@Test
public void testmaximumSwap() {
    assert 1 == maximumSwap(1);
    assert 21 == maximumSwap(12);
    assert 21 == maximumSwap(21);
    assert 7263 == maximumSwap(2763);
    assert 900000001 == maximumSwap(100000009);
    assert 98863 == maximumSwap(98368);
    assert 9913 == maximumSwap(1993);

    assert 833 == maximumSwap(383);
}
