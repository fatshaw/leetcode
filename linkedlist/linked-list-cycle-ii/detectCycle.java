public ListNode detectCycle(ListNode head) {
  if (head == null) {
      return null;
  }

  ListNode tortoise = head;
  ListNode hare = head;
  do {
      tortoise = tortoise.next;
      hare = hare.next;
      if (hare != null) {
          hare = hare.next;
      }
  } while (tortoise != null && hare != null && tortoise != hare);

  ListNode ptr1 = tortoise;
  ListNode ptr2 = head;
  while (ptr1 != ptr2 && ptr1 != null && ptr2 != null) {
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
  }
  return ptr1;
}