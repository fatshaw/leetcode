@Test
public void testdeleteAndEarn() {
    assert 6 == deleteAndEarn(new int[]{3, 4, 2});
    assert 9 == deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4});
}