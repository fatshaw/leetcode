@Test
public void testCostClimbingStairs() {
    assert 2 == minCostClimbingStairs(new int[]{1, 2, 3});
    assert 4 == minCostClimbingStairs(new int[]{1, 12, 3});
    assert 6 == minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
}