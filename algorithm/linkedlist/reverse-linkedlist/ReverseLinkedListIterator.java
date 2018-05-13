public ListNode reverseList(ListNode head) {
  if (head == null) {
      return head;
  }
  
  ListNode pre = null;
  ListNode cur;
  ListNode next;
  cur = head;
  next = cur.next;
  head.next = null;
  while (cur != null) {
      if (pre != null) {
          cur.next = pre;
      }
      pre = cur;
      cur = next;
      if (cur != null) {
          next = cur.next;
      }
  }
  return pre;
}