@Test
public void testsortColors() {
    int[] colors = new int[]{2, 0, 2, 1, 1, 0};
    sortColors(colors);
    Arrays.equals(colors, new int[]{0, 0, 1, 1, 2, 2});
}