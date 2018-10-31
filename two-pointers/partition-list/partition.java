public ListNode partition(ListNode head, int x) {
  ListNode node1 = new ListNode(0);
  ListNode node2 = new ListNode(0);
  ListNode dummy1 = node1;
  ListNode dummy2 = node2;

  ListNode tmp = head;
  while (tmp != null) {
      if (tmp.val < x) {
          node1.next = tmp;
          node1 = tmp;
      } else {
          node2.next = tmp;
          node2 = tmp;
      }
      tmp = tmp.next;
  }

  node2.next = null;
  node1.next = dummy2.next;
  return dummy1.next;
}