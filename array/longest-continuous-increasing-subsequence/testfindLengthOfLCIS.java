
@Test
public void testfindLengthOfLCIS() {
    assert findLengthOfLCIS(new int[]{1, 2, 4}) == 3;
    assert findLengthOfLCIS(new int[]{1, 2, 1, 5}) == 2;
    assert findLengthOfLCIS(new int[]{1, 2, 1, 5, 7}) == 3;
    assert findLengthOfLCIS(new int[]{1, 1, 1, 1}) == 1;
}