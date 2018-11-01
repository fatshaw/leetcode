public ListNode removeNthFromEnd(ListNode head, int n) {
  ListNode fast = head;
  for (int i = 0; i < n; i++) {
      if (fast == null) {
          break;
      }
      fast = fast.next;
  }

  ListNode slow = head;
  ListNode pre = null;
  while (slow != null && fast != null) {
      pre = slow;
      slow = slow.next;
      fast = fast.next;
  }

  if (pre == null) {
      return slow.next;
  }
  pre.next = slow.next;
  return head;

}