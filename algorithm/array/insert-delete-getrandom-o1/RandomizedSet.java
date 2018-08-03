class RandomizedSet {

  Map<Integer, Integer> map;
  Random random;
  ArrayList<Integer> list;

  /**
   * Initialize your data structure here.
   */
  public RandomizedSet() {
      map = new HashMap<>();
      random = new Random(System.currentTimeMillis());
      list = new ArrayList<>();
  }

  /**
   * Inserts a value to the set. Returns true if the set did not already contain the specified element.
   */
  public boolean insert(int val) {
      if (!map.containsKey(val)) {
          map.put(val, list.size());
          list.add(val);
          return true;
      }
      return false;
  }

  /**
   * Removes a value from the set. Returns true if the set contained the specified element.
   */
  public boolean remove(int val) {
      if (!map.containsKey(val)) {
          return false;
      }
      int index = map.get(val);
      if (index != list.size() - 1) {
          list.set(index, list.get(list.size() - 1));
          map.put(list.get(list.size() - 1), index);
      }
      list.remove(list.size() - 1);
      map.remove(val);
      return true;

  }

  /**
   * Get a random element from the set.
   */
  public int getRandom() {
      return list.get(random.nextInt(list.size()));
  }
}