@Test
public void testsummaryRanges() {
    assert summaryRanges(new int[]{0, 1, 2, 4, 5, 7}).equals(new ArrayList<>(Arrays.asList("0->2", "4->5", "7")));
    System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    System.out.println(summaryRanges(new int[]{0, 1, 2, 3, 4, 5}));
    System.out.println(summaryRanges(new int[]{0, 2, 4, 6, 8, 11}));
    System.out.println(summaryRanges(new int[]{0, 2, 4, 6, 8, 11, 12}));
    System.out.println(summaryRanges(new int[]{}));
}