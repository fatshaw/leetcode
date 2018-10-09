import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestIsPalindromeStr(t *testing.T) {
	t.Run("isPalindromeStr ab should return false", func(t *testing.T) {
		ret := isPalindromeStr("ab")
		assert.Equal(t, false, ret, "isPalindromeStr failed")
	})
	t.Run("isPalindromeStr aa should return true", func(t *testing.T) {
		ret := isPalindromeStr("aa")
		assert.Equal(t, true, ret, "isPalindromeStr failed")
	})
	t.Run("isPalindromeStr A man, a plan, a canal: Panama should return true", func(t *testing.T) {
		ret := isPalindromeStr("A man, a plan, a canal: Panama")
		assert.Equal(t, true, ret, "isPalindromeStr failed")
	})
	t.Run("isPalindromeStr race a car a should return false", func(t *testing.T) {
		ret := isPalindromeStr("race a car")
		assert.Equal(t, false, ret, "isPalindromeStr failed")
	})
	t.Run("isPalindromeStr op a should return false", func(t *testing.T) {
		ret := isPalindromeStr("op")
		assert.Equal(t, false, ret, "isPalindromeStr failed")
	})
}
