https://leetcode.com/problems/palindrome-linked-list/description/  
两个指针，一个快，一个慢。快的每次走两步，慢的每次一步。当快的走到链表底部时，慢的正好走了一半。然后将慢指针到链表尾部反转，然后判断两半链表是否相同