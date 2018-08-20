public int numMatchingSubseq(String S, String[] words) {

  Map<Character, List<Integer>> map = new HashMap<>();
  for (int i = 0; i < S.length(); i++) {
      List<Integer> list = map.getOrDefault(S.charAt(i), new ArrayList<>());
      list.add(i);
      map.put(S.charAt(i), list);
  }

  int count = 0;
  for (String s : words) {
      Set<Integer> indexSet = new HashSet<>();
      List<Integer> indexList = new ArrayList<>();
      for (char c : s.toCharArray()) {
          List<Integer> list = map.get(c);
          if (list == null) {
              break;
          }
          for (Integer i : list) {
              if (!indexSet.contains(i) && (indexList.size() == 0 || indexList.get(indexList.size() - 1) < i)) {
                  indexSet.add(i);
                  indexList.add(i);
                  break;
              }
          }
      }
      if (indexList.size() == s.length()) {
          count++;
      }
  }
  return count;
}