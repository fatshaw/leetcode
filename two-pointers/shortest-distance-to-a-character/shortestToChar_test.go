
func TestShortestToChar(t *testing.T) {
	t.Run("PushDominoes ab and a should return [0,1]", func(t *testing.T) {
		ret := shortestToChar("ab", 'a')
		assert.Equal(t, []int{0,1}, ret, "pushDominoes failed")
	})
	t.Run("PushDominoes ab and b should return [1,0]", func(t *testing.T) {
		ret := shortestToChar("ab", 'b')
		assert.Equal(t, []int{1, 0}, ret, "pushDominoes failed")
	})
	t.Run("PushDominoes adefdafecd and f should return [3,2,1,0,1,1,0,1,2,3]", func(t *testing.T) {
		ret := shortestToChar("adefdafecd", 'f')
		assert.Equal(t, []int{3,2,1,0,1,1,0,1,2,3}, ret, "pushDominoes failed")
	})
	t.Run("PushDominoes loveleetcode and e should return [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]", func(t *testing.T) {
		ret := shortestToChar("loveleetcode", 'e')
		assert.Equal(t, []int{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, ret, "pushDominoes failed")
	})
}