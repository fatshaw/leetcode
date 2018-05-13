public ListNode reverseList(ListNode head) {
  if (head == null || head.next == null) {
      return head;
  }

  ListNode next = head.next;
  head.next = null;
  ListNode headRest = reverseList(next);
  next.next = head;
  return headRest;
}