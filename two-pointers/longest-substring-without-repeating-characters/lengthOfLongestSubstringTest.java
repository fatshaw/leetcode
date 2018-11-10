@Test
public void testlengthOfLongestSubstring() {
    assert 4 == lengthOfLongestSubstring("abcd");
    assert 4 == lengthOfLongestSubstring("abcdc");
    assert 5 == lengthOfLongestSubstring("abcdcdefgg");
    assert 3 == lengthOfLongestSubstring("abcabcbb");
    assert 1 == lengthOfLongestSubstring("bbbb");
    assert 3 == lengthOfLongestSubstring("pwwkew");
}