https://leetcode.com/problems/longest-increasing-subsequence/description/  
1. dp: dp[i]表示i结尾的最长LIS长度，dp[j] = max(dp[i] + 1) if a[j] > a[i]
2. 二分查询，dp[i]表示长度为i+1的LIS的结尾最小数字，对于数组中的每一个元素x，在dp中bs查询对应插入下标。如[4,2,5,1,6],
dp[0]=[4],[2],[5],[1],[6]
dp[1]=[2,5],[1,6]
dp[2]=[2,5,6]