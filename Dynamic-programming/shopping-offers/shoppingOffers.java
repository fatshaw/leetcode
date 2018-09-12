public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
  int min = 0;
  for (int i = 0; i < needs.size(); i++) {
      min += price.get(i) * needs.get(i);
  }

  for (List<Integer> supply : special) {
      List<Integer> needCopy = new ArrayList<>(needs);
      int tmp = 0;
      boolean canSupply = true;
      for (int i = 0; i < needCopy.size(); i++) {
          if (supply.get(i) - needCopy.get(i) > 0) {
              canSupply = false;
              break;
          }
      }

      if (canSupply) {
          for (int i = 0; i < needCopy.size(); i++) {
              needCopy.set(i, needCopy.get(i) - supply.get(i));
          }
          tmp += supply.get(supply.size() - 1) + shoppingOffers(price, special, needCopy);
          min = Math.min(min, tmp);
      }
  }

  return min;
}