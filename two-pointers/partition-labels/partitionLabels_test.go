import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestPartitionLabels(t *testing.T) {
	t.Run("partitionLabels ab should return [1,1]", func(t *testing.T) {
		ret := partitionLabels("ab")
		assert.Equal(t, []int{1, 1}, ret, "isPalindromeStr failed")
	})
	t.Run("partitionLabels abac should return [3,1]", func(t *testing.T) {
		ret := partitionLabels("abac")
		assert.Equal(t, []int{3, 1}, ret, "isPalindromeStr failed")
	})
	t.Run("partitionLabels abadca should return [3,1]", func(t *testing.T) {
		ret := partitionLabels("abac")
		assert.Equal(t, []int{3, 1}, ret, "isPalindromeStr failed")
	})
	t.Run("partitionLabels ababcbacadefegdehijhklij should return [9,7,8]", func(t *testing.T) {
		ret := partitionLabels("ababcbacadefegdehijhklij")
		assert.Equal(t, []int{9, 7, 8}, ret, "isPalindromeStr failed")
	})
}
