@Test
public void testmerge2() {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1, 3));
    intervals.add(new Interval(2, 6));
    intervals.add(new Interval(8, 10));
    intervals.add(new Interval(15, 18));
    List<Interval> merged = merge(intervals);
    assert merged.toString().equals("[[1,6], [8,10], [15,18]]") : merged.toString();

    intervals = new ArrayList<>();
    intervals.add(new Interval(1, 4));
    intervals.add(new Interval(4, 5));
    merged = merge(intervals);
    assert merged.toString().equals("[[1,5]]") : merged.toString();

    intervals = new ArrayList<>();
    intervals.add(new Interval(1, 4));
    intervals.add(new Interval(2, 5));
    intervals.add(new Interval(3, 15));
    intervals.add(new Interval(6, 7));
    merged = merge(intervals);
    assert merged.toString().equals("[[1,15]]") : merged.toString();
}