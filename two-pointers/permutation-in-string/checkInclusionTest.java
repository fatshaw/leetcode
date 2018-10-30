@Test
public void testcheckInclusion() {
    assert checkInclusion("ab", "eidbaooo");
    assert checkInclusion("ab", "aeidbaooo");
    assert !checkInclusion("ab", "eidboaoo");
}