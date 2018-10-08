func TestStrStr(t *testing.T) {
	t.Run("strStr ab of a should return 0", func(t *testing.T) {
		ret := strStr("ab", "a")
		assert.Equal(t, 0, ret, "strStr failed")
	})
	t.Run("strStr hello of ll should return 2", func(t *testing.T) {
		ret := strStr("hello", "ll")
		assert.Equal(t, 2, ret, "strStr failed")
	})
	t.Run("strStr aaaaa of bba should return -1", func(t *testing.T) {
		ret := strStr("aaaaa", "bb")
		assert.Equal(t, -1, ret, "strStr failed")
	})
	t.Run("strStr ab of empty should return 0", func(t *testing.T) {
		ret := strStr("ab", "")
		assert.Equal(t, 0, ret, "strStr failed")
	})
	t.Run("strStr empty of ab should return -1", func(t *testing.T) {
		ret := strStr("", "ab")
		assert.Equal(t, -1, ret, "strStr failed")
	})
	t.Run("strStr mississippi of issip should return 4", func(t *testing.T) {
		ret := strStr("mississippi", "issip")
		assert.Equal(t, 4, ret, "strStr failed")
	})
}