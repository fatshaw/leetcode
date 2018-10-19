
import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestMySqrt(t *testing.T) {
	t.Run("MySqrt 5 should return 2", func(t *testing.T) {
		ret := mySqrt(5)
		assert.Equal(t, 2, ret, "mySqrt failed")
	})

	t.Run("MySqrt 8 should return 2", func(t *testing.T) {
		ret := mySqrt(8)
		assert.Equal(t, 2, ret, "mySqrt failed")
	})

	t.Run("MySqrt 9 should return 3", func(t *testing.T) {
		ret := mySqrt(9)
		assert.Equal(t, 3, ret, "mySqrt failed")
	})

	t.Run("MySqrt 12 should return 3", func(t *testing.T) {
		ret := mySqrt(12)
		assert.Equal(t, 3, ret, "mySqrt failed")
	})

	t.Run("MySqrt 120 should return 10", func(t *testing.T) {
		ret := mySqrt(120)
		assert.Equal(t, 10, ret, "mySqrt failed")
	})

	t.Run("MySqrt 1 should return 1", func(t *testing.T) {
		ret := mySqrt(1)
		assert.Equal(t, 1, ret, "mySqrt failed")
	})

	t.Run("MySqrt 2 should return 1", func(t *testing.T) {
		ret := mySqrt(2)
		assert.Equal(t, 1, ret, "mySqrt failed")
	})

	t.Run("MySqrt 3 should return 1", func(t *testing.T) {
		ret := mySqrt(3)
		assert.Equal(t, 1, ret, "mySqrt failed")
	})

	t.Run("MySqrt 4 should return 2", func(t *testing.T) {
		ret := mySqrt(4)
		assert.Equal(t, 2, ret, "mySqrt failed")
	})
}
