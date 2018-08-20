@Test
public void testnumMatchingSubseq() {
    assert 3 == numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"});
    assert 2 == numMatchingSubseq("nwmswzegbu", new String[]{"mswz", "swzegb", "tpwhdywjst", "dglnzwitub"});
}