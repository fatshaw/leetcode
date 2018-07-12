public boolean hasCycle(ListNode head) {
  if (head == null) {
      return false;
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

  return hare != null;
}