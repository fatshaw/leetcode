class MyCalendarTwo {

  TreeMap<Integer, Integer> map = new TreeMap<>();

  public MyCalendarTwo() {

  }

  public boolean book(int start, int end) {
      map.put(start, map.getOrDefault(start, 0) + 1);
      map.put(end, map.getOrDefault(end, 0) - 1);

      int d = 0;
      for (Integer v : map.values()) {
          d += v;
          if (d == 3) {
              map.put(start, map.get(start) - 1);
              map.put(end, map.get(end) + 1);
              return false;
          }
      }
      return true;
  }
}