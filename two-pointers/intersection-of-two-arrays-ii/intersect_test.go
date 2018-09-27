func TestIntersect(t *testing.T) {
	t.Run("intersect {1, 2, 3} and {1, 2, 3} should return {1, 2, 3}", func(t *testing.T) {
		ret := intersect([]int{1, 2, 3}, []int{1, 2, 3})
		assert.Equal(t, []int{1, 2, 3}, ret, "intersect failed")
	})
	t.Run("intersect {1, 2,2} and {1, 2, 3,2} should return {1, 2, 2}", func(t *testing.T) {
		ret := intersect([]int{1, 2, 2}, []int{1, 2, 3, 2})
		assert.Equal(t, []int{1, 2, 2}, ret, "intersect failed")
	})
	t.Run("intersect {1,2,2,1} and {2,2} should return {2, 2}", func(t *testing.T) {
		ret := intersect([]int{1, 2, 2, 1}, []int{2, 2})
		assert.Equal(t, []int{2, 2}, ret, "intersect failed")
	})
	t.Run("intersect {4,9,5} and {9,4,9,8,4} should return {4,9}", func(t *testing.T) {
		ret := intersect([]int{4, 9, 5}, []int{9, 4, 9, 8, 4})
		assert.Equal(t, []int{4, 9}, ret, "intersect failed")
	})
}