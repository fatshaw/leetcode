class MyCalendar {

  TreeMap<Integer, Integer> map = new TreeMap<>();

  public MyCalendar() {

  }

  public boolean book(int start, int end) {
      Integer prev = map.floorKey(start);
      Integer after = map.ceilingKey(start);

      if ((prev == null || map.get(prev) <= start) && (after == null || end <= after)) {
          map.put(start, end);
          return true;
      }
      return false;

  }
}