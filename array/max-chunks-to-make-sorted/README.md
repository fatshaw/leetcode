https://leetcode.com/problems/max-chunks-to-make-sorted/description/  
题目的前提是nums[i]范围是[0,n-1]，所以对于nums[i] == i，并且nums[i] = max(0,i)，则表示nums[0,i]是可以排序有序的。chunks个数加1。