https://leetcode.com/problems/find-the-duplicate-number/description/  
n+1个数，取值范围是1-n，所以并且有一个数是重复的。  
如果按照next=num[cur]的方式遍历数组，则会出现环，因为有一个数是重复的，会出现两次  
所以题目可以退化为在一个链表中找到环的入口，即Floyd's Tortoise and Hare问题  
假设一个链表有环，乌龟每次走一步，兔子每次走两步，在距离环入口x处相遇，假设起点距离环入口距离s，则乌龟走了s+x步，兔子比乌龟多走了s+x步，说明环的长度是s+x。如果乌龟从头开始走，兔子继续在x处一步一步走，则相遇处一定是环的入口。
