@Test
public void testmaxProfit() {
    assert 0 == maxProfit(new int[]{1, 2}, 2);
    assert 2 == maxProfit(new int[]{1, 5}, 2);
    assert 2 == maxProfit(new int[]{3, 1, 5}, 2);

    assert 2 == maxProfit(new int[]{1, 2, 5}, 2);
    assert 8 == maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2);
    assert 13 == maxProfit(new int[]{1, 4, 6, 2, 8, 3, 10, 14}, 3);
}
