https://leetcode.com/problems/combination-sum/description/  
排列组合题目  
1. 为了使排列组合不重复，需要先对数组排序  
2. 遍历数组，避免重复遍历，所以变量下标从0开始，然后每递归从上一次遍历的元素开始（可以重复）
3. 遍历过程中，记录remain表示剩余数值，每遍历一个数，remain-=nums[i]，当remain=0表示找到组合，remain<0表示遍历结束，因为数组是排序过的。