@Test
public void testgetRandomList() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    Solution solution = new Solution(head);
    System.out.println(solution.getRandom());
}