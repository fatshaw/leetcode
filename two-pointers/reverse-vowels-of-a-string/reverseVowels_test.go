import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestReverseVowels(t *testing.T) {
	t.Run("ReverseVowels hello should return holle", func(t *testing.T) {
		ret := reverseVowels("hello")
		assert.Equal(t, "holle", ret, "ReverseVowels failed")
	})
	t.Run("ReverseVowels leetcode should return leotcede", func(t *testing.T) {
		ret := reverseVowels("leetcode")
		assert.Equal(t, "leotcede", ret, "ReverseVowels failed")
	})
	t.Run("ReverseVowels aA should return Aa", func(t *testing.T) {
		ret := reverseVowels("aA")
		assert.Equal(t, "Aa", ret, "ReverseVowels failed")
	})
}
