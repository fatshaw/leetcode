
import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestIsPalindrome(t *testing.T) {
	t.Run("isPalindrome 1->2 should return false", func(t *testing.T) {
		var header ListNode
		header.Val = 1
		header.Next = new(ListNode)
		header.Next.Val = 2
		header.Next.Next = nil
		ret := isPalindrome(&header)
		assert.Equal(t, false, ret, "isPalindrome failed")
	})
	t.Run("isPalindrome 1->1->1 should return true", func(t *testing.T) {
		var header ListNode
		header.Val = 1
		header.Next = new(ListNode)
		header.Next.Val = 1
		header.Next.Next = new(ListNode)
		header.Next.Next.Val = 1
		ret := isPalindrome(&header)
		assert.Equal(t, true, ret, "isPalindrome failed")
	})
	t.Run("isPalindrome 1->1->2 should return false", func(t *testing.T) {
		var header ListNode
		header.Val = 1
		header.Next = new(ListNode)
		header.Next.Val = 1
		header.Next.Next = new(ListNode)
		header.Next.Next.Val = 2
		ret := isPalindrome(&header)
		assert.Equal(t, false, ret, "isPalindrome failed")
	})
	t.Run("isPalindrome 1->1 should return true", func(t *testing.T) {
		var header ListNode
		header.Val = 1
		header.Next = new(ListNode)
		header.Next.Val = 1
		header.Next.Next = nil
		ret := isPalindrome(&header)
		assert.Equal(t, true, ret, "isPalindrome failed")
	})
	t.Run("isPalindrome 1->2->2->1 should return true", func(t *testing.T) {
		var header ListNode
		header.Val = 1
		header.Next = new(ListNode)
		header.Next.Val = 2
		header.Next.Next = new(ListNode)
		header.Next.Next.Val = 2
		header.Next.Next.Next = new(ListNode)
		header.Next.Next.Next.Val = 1
		ret := isPalindrome(&header)
		assert.Equal(t, true, ret, "isPalindrome failed")
	})
}
