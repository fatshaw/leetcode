@Test
public void testpartition2() {

    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(4);
    node.next.next.next = new ListNode(3);
    node.next.next.next.next = new ListNode(2);

    ListNode p = partition(node, 3);
    while (p != null) {
        System.out.println(p.val);
        p = p.next;
    }

    System.out.println("..............");

    node = new ListNode(1);
    node.next = new ListNode(4);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(2);
    node.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next = new ListNode(2);

    p = partition(node, 3);
    while (p != null) {
        System.out.println(p.val);
        p = p.next;
    }

    System.out.println("..............");

    node = new ListNode(3);
    node.next = new ListNode(2);
    node.next.next = new ListNode(1);

    p = partition(node, 3);
    while (p != null) {
        System.out.println(p.val);
        p = p.next;
    }

    System.out.println("..............");

    node = new ListNode(1);
    node.next = new ListNode(1);
    node.next.next = new ListNode(1);

    p = partition(node, 2);
    while (p != null) {
        System.out.println(p.val);
        p = p.next;
    }
}