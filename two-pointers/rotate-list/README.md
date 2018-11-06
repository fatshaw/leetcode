https://leetcode.com/problems/rotate-list/description/  
### Fast and Slow Pointer Solution
* fast pointer first walk ahead k step. if through the road it reaches the end of list which means k > length of list we should change k = k % n + n where n = length of list.  
* when fast pointer stops, slow pointer should start from head and both pointers walk ahead step by step
* When fast pointer reaches the end of list again, the slow pointer is the end of new rotated list and slow.next is head of the new list.   

```
public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return null;
        }

        int n = 0;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
            n++;
            if (fast == null) {
                k = k % n + n;
                fast = head;
            }
        }

        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (fast != slow) {
            fast.next = head;
            head = slow.next;
            slow.next = null;
        }

        return head;
    }
```