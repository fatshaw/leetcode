public int[] intersection(int[] nums1, int[] nums2) {
  Arrays.sort(nums1);
  Arrays.sort(nums2);
  int l1 = 0;
  int l2 = 0;
  Set<Integer> result = new HashSet<>();
  while (l1 < nums1.length && l2 < nums2.length) {
      if (nums1[l1] == nums2[l2]) {
          result.add(nums1[l1]);
          l1++;
          l2++;
      } else if (nums1[l1] > nums2[l2]) {
          l2++;
      } else {
          l1++;
      }
  }
  return result.stream().mapToInt(i -> i).toArray();
}