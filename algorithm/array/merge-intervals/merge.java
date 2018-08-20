public List<Interval> merge(List<Interval> intervals) {
  intervals.sort(Comparator.comparingInt(i -> i.start));
  List<Interval> mergedInterval = new ArrayList<>();
  for (Interval i : intervals) {
      if (mergedInterval.size() == 0) {
          mergedInterval.add(i);
      } else {
          Interval last = mergedInterval.get(mergedInterval.size() - 1);
          if (last.end < i.start) {
              mergedInterval.add(i);
          }
          if (i.start <= last.end) {
              last.end = Math.max(last.end, i.end);
          }
      }
  }
  return mergedInterval;
}