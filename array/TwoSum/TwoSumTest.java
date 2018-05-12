@Test
public void testTwoSum() {
	assert twoSum(new int[]{1, 2, 3}, 2) == null;
	assert twoSum(new int[]{1, 2, 3, 5}, 3)[0] == 0;
	assert twoSum(new int[]{1, 2, 3, 5}, 3)[1] == 1;
	assert twoSum(new int[]{1, 2, 3, 5}, 8)[0] == 2;

}
