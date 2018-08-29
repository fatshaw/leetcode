@Test
public void testcountSubstrings() {
    assert 6 == countSubstrings("aaa");
    assert 3 == countSubstrings("aa");
    assert 3 == countSubstrings("abc");
    assert 6 == countSubstrings("aabb");
    assert 6 == countSubstrings("abba");
}