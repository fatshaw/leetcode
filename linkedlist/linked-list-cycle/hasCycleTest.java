@Test
public void testhasCycle() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    assert !hasCycle(head);

    head.next.next.next.next = head.next;
    assert hasCycle(head);
}