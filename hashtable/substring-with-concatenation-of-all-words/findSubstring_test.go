
func TestFindSubstring(t *testing.T) {

	t.Run("findSubstring s=ab and words=[a,b] should return [0]", func(t *testing.T) {
		ret := findSubstring("ab", []string{"a", "b"})
		assert.Equal(t, []int{0}, ret, "findSubstring failed")
	})

	t.Run("findSubstring s=barfoothefoobarman and words=[foo,bar] should return [0,9]", func(t *testing.T) {
		ret := findSubstring("barfoothefoobarman", []string{"foo", "bar"})
		assert.Equal(t, []int{0,9}, ret, "findSubstring failed")
	})

	t.Run("findSubstring s=wordgoodstudentgoodword and words=[word,student] should return []", func(t *testing.T) {
		ret := findSubstring("wordgoodstudentgoodword", []string{"word", "student"})
		assert.Equal(t, []int{}, ret, "findSubstring failed")
	})

	t.Run("findSubstring s=abca and words=[a,b,c] should return [0,1]", func(t *testing.T) {
		ret := findSubstring("abca", []string{"a", "b","c"})
		assert.Equal(t, []int{0,1}, ret, "findSubstring failed")
	})

	t.Run("findSubstring s= and words=[] should return []", func(t *testing.T) {
		ret := findSubstring("", []string{})
		assert.Equal(t, []int{}, ret, "findSubstring failed")
	})
	t.Run("findSubstring s=wordgoodgoodgoodbestword and words=[word,good,best,good] should return [8]", func(t *testing.T) {
		ret := findSubstring("wordgoodgoodgoodbestword", []string{"word","good","best","good"})
		assert.Equal(t, []int{8}, ret, "findSubstring failed")
	})

	t.Run("findSubstring s=wordgoodgoodgoodbestword and words=word,good,best,word should return empty", func(t *testing.T) {
		ret := findSubstring("wordgoodgoodgoodbestword", []string{"word","good","best","word"})
		assert.Equal(t, []int{}, ret, "findSubstring failed")
	})
}
