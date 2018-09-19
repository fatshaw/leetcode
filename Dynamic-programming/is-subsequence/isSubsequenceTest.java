@Test
public void testisSubsequence() {
    assert isSubsequence("abc", "ahbgdc");

    assert !isSubsequence("axc", "ahbgdc");
    assert isSubsequence("ppaab", "paappaab");

}