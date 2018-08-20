public int majorityElement(int[] nums) {
    int count = 0;
    int result = 0;
    for (int n : nums) {
        if (count == 0) {
            result = n;
        }
        count += (result == n) ? 1 : -1;
    }
    return result;
}