@Test
public void testrotateRight() {
  ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);

    ListNode p = rotateRight(node, 1);
    while (p != null) {
        System.out.println(p.val);
        p = p.next;
    }
}