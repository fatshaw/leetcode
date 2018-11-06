public ListNode rotateRight(ListNode head, int k) {
  int n = 0;
  ListNode fast = head;
  for (int i = 0; i < k && fast != null; i++) {
      fast = fast.next;
      n++;
      if (fast == null) {
          k = k % n + n; // prevent k is much bigger than length of list
          fast = head;
      }
  }

  ListNode slow = head;
  while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;
  }

  if (fast != slow) {
      ListNode tmp = slow.next;
      slow.next = null;
      fast.next = head;
      head = tmp;
  }

  return head;
}