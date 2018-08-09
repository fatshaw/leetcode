@Test
public void testRemoveDuplicates() {
    int[] nums = new int[]{1};
    int[] expected = new int[]{1};
    assert 1 == removeDuplicates(nums);
    assert Arrays.equals(nums, expected);

    nums = new int[]{1, 1, 1, 1};
    expected = new int[]{1, 1, 1, 1};
    assert 2 == removeDuplicates(nums);
    assert Arrays.equals(nums, expected);

    nums = new int[]{1, 1, 1, 2, 2};
    expected = new int[]{1, 1, 2, 2, 2};
    assert 4 == removeDuplicates(nums);
    assert Arrays.equals(nums, expected);

    nums = new int[]{1, 1, 1, 2, 2, 3, 3, 3, 4};
    expected = new int[]{1, 1, 2, 2, 3, 3, 4, 3, 4};
    assert 7 == removeDuplicates(nums);
    assert Arrays.equals(nums, expected);

    nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
    expected = new int[]{0, 0, 1, 1, 2, 3, 3, 3, 3};
    assert 7 == removeDuplicates(nums);
    assert Arrays.equals(nums, expected);

}