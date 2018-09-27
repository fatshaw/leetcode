func intersect(nums1 []int, nums2 []int) []int {
	sort.Ints(nums1)
	sort.Ints(nums2)
	l := 0
	r := 0
	var ret []int
	for ; l < len(nums1) && r < len(nums2); {
		if nums1[l] == nums2[r] {
			ret = append(ret, nums1[l])
			l++
			r++
		} else if nums1[l] > nums2[r] {
			r++
		} else {
			l++
		}
	}
	return ret
}
