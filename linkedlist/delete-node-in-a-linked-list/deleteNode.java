public void deleteNode(ListNode node) {
  ListNode tmp = node;
  ListNode pre = node;
  while (tmp != null && tmp.next != null) {
      tmp.val = tmp.next.val;
      pre = tmp;
      tmp = tmp.next;
  }
  pre.next = null;
}

public void deleteNode(ListNode node) {
  node.val = node.next.val;
  node.next = node.next.next;
}