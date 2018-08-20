@Test
public void reverse() {
    assert reverseWords("the sky is blue").equals("blue is sky the");
    assert reverseWords("aa       a").equals("a aa");
    assert reverseWords(" a ab ").equals("ab a");
}