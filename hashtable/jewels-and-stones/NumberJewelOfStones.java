public int numJewelsInStones(String J, String S) {
    int count = 0;
    for (char c : J.toCharArray()) {
        for (char d : S.toCharArray()) {
            count += c == d ? 1 : 0;
        }
    }
    return count;
}