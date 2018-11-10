public int lengthOfLongestSubstring(String s) {
  int[] letters = new int[128];
  Arrays.fill(letters, -1);
  int answer = 0;
  int leftBound = -1;
  for (int i = 0; i < s.length(); i++) {
      int c = s.charAt(i);
      if (letters[c] > leftBound) {
          leftBound = letters[c];
      }
      answer = Math.max(answer, i - leftBound);
      letters[c] = i;
  }
  return answer;
}