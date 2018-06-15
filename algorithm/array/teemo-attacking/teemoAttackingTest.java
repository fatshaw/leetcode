@Test
public void testfindPoisonedDuration(){
    assert 4 == findPoisonedDuration(new int[]{1,4},2);
    assert 3 == findPoisonedDuration(new int[]{1,2},2);
    assert 5 == findPoisonedDuration(new int[]{1,4,5},2);
}