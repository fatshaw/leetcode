https://leetcode.com/problems/next-permutation/description/  
1. 找到第一个nums[i] < nums[i+1]  1，3，2 => 1
2. 找到第一个大于1的元素 1，3，2 => 2
3. 交互1，2 => 2,3,1
4. 倒置3，1 => 2,1,3