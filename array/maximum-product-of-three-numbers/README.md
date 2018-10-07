https://leetcode.com/problems/maximum-product-of-three-numbers/description/  
取三个数，乘积最大，可能情况为：
1. 3个最大的正数相乘
2. 2个最小的负数乘以一个最大的正数

所以只要找到最大的三个正数，后两个最小的数，然后进行比较即可