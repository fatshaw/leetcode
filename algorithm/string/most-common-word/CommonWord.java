public String mostCommonWord(String paragraph, String[] banned) {

  String replaced = paragraph.replaceAll("[!?',;.]", "");
  Set<String> banSet = new HashSet<>(Arrays.asList(banned));
  Map<String, Integer> map = new HashMap<>();

  int maxCount = 0;
  String max = "";

  for (String s : replaced.split(" ")) {
      String tmp = s.toLowerCase();
      if (!banSet.contains(tmp)) {
          map.put(tmp, map.getOrDefault(tmp, 0) + 1);
          if (map.get(tmp) > maxCount) {
              max = tmp;
              maxCount = map.get(tmp);
          }
      }
  }

  return max;
}