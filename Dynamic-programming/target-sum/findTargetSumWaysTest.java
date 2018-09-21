@Test
public void testfindTargetSumWays() {
    assert findTargetSumWays(new int[]{1}, 1) == 1;
    assert findTargetSumWays(new int[]{1}, 2) == 0;
    assert findTargetSumWays(new int[]{1, 2, 2}, 1) == 2;
    assert findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3) == 5;
    assert findTargetSumWays(new int[]{0, 1}, 1) == 2;
    assert findTargetSumWays(new int[]{0, 0, 1}, 1) == 4;
    assert findTargetSumWays(new int[]{0, 0, 0, 0, 0,0,1}, 1) == 64;
}
