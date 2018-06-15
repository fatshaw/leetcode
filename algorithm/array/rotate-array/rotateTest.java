@Test
public void testrotate() {
    int[] nums = new int[]{1, 2, 3};
    rotate(nums, 2);
    assert Arrays.equals(nums, new int[]{2, 3, 1});

    nums = new int[]{-1, -100, 3, 99};
    rotate(nums, 2);
    assert Arrays.equals(nums, new int[]{3, 99, -1, -100});

    nums = new int[]{1, 2, 3, 4, 5, 6, 7};
    rotate(nums, 3);
    assert Arrays.equals(nums, new int[]{5, 6, 7, 1, 2, 3, 4});

    nums = new int[]{1, 2};
    rotate(nums, 3);
    assert Arrays.equals(nums, new int[]{2, 1});
}