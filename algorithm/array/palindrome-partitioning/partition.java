void backtrackPartition(List<List<String>> result, List<String> temp, String s, int start) {
  if (start == s.length()) {
      result.add(new ArrayList<>(temp));
  }
  for (int i = start; i < s.length(); i++) {
      if (isPalindrome(s, start, i)) {
          temp.add(s.substring(start, i + 1));
          backtrackPartition(result, temp, s, i + 1);
          temp.remove(temp.size() - 1);
      }
  }
}

boolean isPalindrome(String s, int start, int end) {
  while (start < end) {
      if (s.charAt(start++) != s.charAt(end--)) {
          return false;
      }
  }
  return true;
}

public List<List<String>> partition(String s) {
  List<List<String>> results = new ArrayList<>();
  backtrackPartition(results, new ArrayList<>(), s, 0);
  return results;
}