@Test
public void testnextPermutation() {
    int[] nums = new int[]{1, 2, 3};
    int[] exp = new int[]{1, 3, 2};
    nextPermutation(nums);
    assert Arrays.equals(nums, exp);

    nums = new int[]{2, 3, 5, 5};
    exp = new int[]{2, 5, 3, 5};
    nextPermutation(nums);
    assert Arrays.equals(nums, exp);

    nums = new int[]{1, 3, 2};
    exp = new int[]{2, 1, 3};
    nextPermutation(nums);
    assert Arrays.equals(nums, exp);

    nums = new int[]{2, 4, 3, 2};
    exp = new int[]{3, 2, 2, 4};
    nextPermutation(nums);
    assert Arrays.equals(nums, exp);

    nums = new int[]{2, 4, 3, 3, 2, 2};
    exp = new int[]{3, 2, 2, 2, 3, 4};
    nextPermutation(nums);
    assert Arrays.equals(nums, exp);

    nums = new int[]{16, 27, 25, 23, 25, 16, 12, 9, 1, 2, 7, 20, 19, 23, 16, 0, 6, 22, 16, 11, 8, 27, 9, 2, 20, 2,
        13, 7, 25, 29, 12, 12, 18, 29, 27, 13, 16, 1, 22, 9, 3, 21, 29, 14, 7, 8, 14, 5, 0, 23, 16, 1, 20};
    exp = new int[]{16, 27, 25, 23, 25, 16, 12, 9, 1, 2, 7, 20, 19, 23, 16, 0, 6, 22, 16, 11, 8, 27, 9, 2, 20, 2,
        13, 7, 25, 29, 12, 12, 18, 29, 27, 13, 16, 1, 22, 9, 3, 21, 29, 14, 7, 8, 14, 5, 0, 23, 16, 20, 1};
    nextPermutation(nums);
    assert Arrays.equals(nums, exp);

}