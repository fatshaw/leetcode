@Test
public void testdetectCycle() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    ListNode circle = detectCycle(head);
    assert circle == null;

    head.next.next.next.next = head.next;
    circle = detectCycle(head);
    assert circle == head.next;
}