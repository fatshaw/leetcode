https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/  
遍历一遍数组，如果num[i] > num[i-1]，长度增加一，否则长度从零开始。记录长度最大值