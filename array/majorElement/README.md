https://leetcode.com/problems/majority-element/description/  
找到超过半数的元素m，则将集合分为两类A,B，A表示超过一半以上的元素，B是其他，随机找任意两个数a,b，有几种情况：  
1. a,b都属于A
2. a,b都属于B
3. a,b分别属于A,B
初始随机选择一个数a作为候选结果，然后随机选b，如果a,b相同，则计数加1，如果不相同，计数减一。如果计数为零，则表示之前的所有数可以丢弃。因为丢弃的数对于最终结果没有影响。如果计数不变为0，则候选数a就是最终结果
