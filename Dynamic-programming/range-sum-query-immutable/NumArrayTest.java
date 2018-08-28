@Test
public void testsumRange(){
    NumArray array = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
    assert 1 == array.sumRange(0,2);
    assert 3 == array.sumRange(1,2);
    assert 0 == array.sumRange(2,4);
    assert -3 == array.sumRange(0,5);
}