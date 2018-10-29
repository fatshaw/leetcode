https://leetcode.com/problems/linked-list-random-node/description/  
如果链表长度固定，则将链表转为数组，随机求下标即可  
如果链表长度不固定，使用蓄水池算法，相当于k=1，对于遍历的每个元素的概率都为k/n，即1/n  
