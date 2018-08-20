@Test
public void testfindDuplicate(){
    assert 2 == findDuplicate(new int[]{1,3,4,2,2});
    assert 3 == findDuplicate(new int[]{3,1,3,4,2});
}