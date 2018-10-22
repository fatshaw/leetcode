
func TestFindLongestWord(t *testing.T) {

	t.Run("FindLongestWord abc and ab should return ab", func(t *testing.T) {
		ret := findLongestWord("abc",[]string{"ab"})
		assert.Equal(t, "ab", ret, "findLongestWord failed")
	})

	t.Run("FindLongestWord abpcplea and \"ale\",\"apple\",\"monkey\",\"plea\" should return apple", func(t *testing.T) {
		ret := findLongestWord("abpcplea",[]string{"ale","apple","monkey","plea"})
		assert.Equal(t, "apple", ret, "findLongestWord failed")
	})

	t.Run("FindLongestWord abpcplea and a,b,c should return a", func(t *testing.T) {
		ret := findLongestWord("abpcplea",[]string{"a","b","c"})
		assert.Equal(t, "a", ret, "findLongestWord failed")
	})

	t.Run("FindLongestWord abpcplea and kk should return empty", func(t *testing.T) {
		ret := findLongestWord("abpcplea",[]string{"kk"})
		assert.Equal(t, "", ret, "findLongestWord failed")
	})

	t.Run("FindLongestWord abpcplea and abc,apc should return abc", func(t *testing.T) {
		ret := findLongestWord("abpcplea",[]string{"apc","abc"})
		assert.Equal(t, "abc", ret, "findLongestWord failed")
	})
}