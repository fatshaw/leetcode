https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/description/  
dp问题
dp[i]表示以A[i]结尾的满足条件的子数组个数，则  
如果A[i] < L，则A[i]可以和以A[i-1]结尾的子数组合并，则dp[i] = dp[i-1]  
如果A[i] > R, 则以A[i]结尾的满足条件的子数组个数为0,设置prev=i,表示不满足条件数值的下标
如果L < A[i] < R, 则以A[i]结尾的满足条件的子数组个数为dp[i] = i - prev  
所以，总的满足条件的子数组数量为dp[0]+dp[1]+...dp[n-1]
