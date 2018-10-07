func TestBackspaceCompare(t *testing.T) {
	t.Run("BackspaceCompare ab and ab should return true", func(t *testing.T) {
		ret := backspaceCompare("ab", "ab")
		assert.Equal(t, true, ret, "backspaceCompare failed")
	})
	t.Run("BackspaceCompare a# and a should return false", func(t *testing.T) {
		ret := backspaceCompare("a#", "a")
		assert.Equal(t, false, ret, "backspaceCompare failed")
	})
	t.Run("BackspaceCompare a#b and a#b should return true", func(t *testing.T) {
		ret := backspaceCompare("a#b", "a#b")
		assert.Equal(t, true, ret, "backspaceCompare failed")
	})
	t.Run("BackspaceCompare a#b and a#b# should return false", func(t *testing.T) {
		ret := backspaceCompare("a#b", "a#b#")
		assert.Equal(t, false, ret, "backspaceCompare failed")
	})
	t.Run("BackspaceCompare a##c and #a#c should return true", func(t *testing.T) {
		ret := backspaceCompare("a##c", "#a#c")
		assert.Equal(t, true, ret, "backspaceCompare failed")
	})
	t.Run("BackspaceCompare a#c and b should return false", func(t *testing.T) {
		ret := backspaceCompare("a#c", "b")
		assert.Equal(t, false, ret, "backspaceCompare failed")
	})
}