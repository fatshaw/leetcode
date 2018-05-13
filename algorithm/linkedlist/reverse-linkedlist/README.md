反转链表，分为递归和循环两种方式  
1. 递归
  递归反转head.next,返回递归完成的头结点headRest，然后head.next.next = head,head.next = null
2. 循环
  利用pre,cur,next三个指针来循环遍历链表，并对于每个元素改变cur.next = pre