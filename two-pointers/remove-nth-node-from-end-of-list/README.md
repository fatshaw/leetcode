https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/  
two pointer, one is slow and another is fast  
first of all, fast pointer move n step so that difference between slow one and fast one is n, then slow pointer and fast pointer move forward together. when fast one reach the end of the list, the slow one is the last n node of the list.