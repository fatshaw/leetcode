https://leetcode.com/problems/move-zeroes/description/  
两种方案：
1. 将非0元素放到数组开头，剩余元素填0
2. 将非0和数组开头进行交换。只对非0交换，0不动。相比上一种，如果数组大量0，则相对操作次数少点