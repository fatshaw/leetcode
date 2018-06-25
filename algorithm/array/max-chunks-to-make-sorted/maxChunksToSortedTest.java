@Test
public void testmaxChunksToSorted(){
    assert maxChunksToSorted(new int[]{1,0,2,3,4}) == 4;
    assert maxChunksToSorted(new int[]{4,3,2,1,0}) == 1;
    assert maxChunksToSorted(new int[]{1,2,0,3}) == 2;
}
