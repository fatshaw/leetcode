func reverseLinkedList(head *ListNode) *ListNode {
	var prev *ListNode = nil
	for head != nil {
		next := head.Next
		head.Next = prev
		prev = head
		head = next
	}
	return prev
}

func isPalindrome(head *ListNode) bool {
	slow := head
	fast := head
	for fast != nil && fast.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next
	}
	if fast != nil {
		slow = slow.Next
	}
	slow = reverseLinkedList(slow)

	for slow != nil {
		if head.Val != slow.Val {
			return false
		}
		head = head.Next
		slow = slow.Next
	}
	return true
}