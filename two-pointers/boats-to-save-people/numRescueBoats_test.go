
import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestNumRescueBoats(t *testing.T) {
	t.Run("numRescueBoats people=[1,2] and limit=3 should return 1", func(t *testing.T) {
		ret := numRescueBoats([]int{1, 2}, 3)
		assert.Equal(t, 1, ret, "numRescueBoats failed")
	})

	t.Run("numRescueBoats people=[3,2,2,1] and limit=3 should return 3", func(t *testing.T) {
		ret := numRescueBoats([]int{3, 2, 2, 1}, 3)
		assert.Equal(t, 3, ret, "numRescueBoats failed")
	})

	t.Run("numRescueBoats people=[3,5,3,4] and limit=5 should return 4", func(t *testing.T) {
		ret := numRescueBoats([]int{3, 5, 3, 4}, 5)
		assert.Equal(t, 4, ret, "numRescueBoats failed")
	})

	t.Run("numRescueBoats people=[4,4,3,3,2] and limit=4 should return 5", func(t *testing.T) {
		ret := numRescueBoats([]int{4, 4, 3, 3, 2}, 4)
		assert.Equal(t, 5, ret, "numRescueBoats failed")
	})

	t.Run("numRescueBoats people=5,5,1,4,2 and limit=5 should return 4", func(t *testing.T) {
		ret := numRescueBoats([]int{5, 5, 1, 4, 2}, 5)
		assert.Equal(t, 4, ret, "numRescueBoats failed")
	})

	t.Run("numRescueBoats people=3,3,2,2,2 and limit=6 should return 3", func(t *testing.T) {
		ret := numRescueBoats([]int{3, 3, 2, 2, 2}, 6)
		assert.Equal(t, 3, ret, "numRescueBoats failed")
	})
}
