https://leetcode.com/problems/arithmetic-slices/description/  
动态规划，dp[i]表示以A[i]结尾的等差数列个数，则dp[i] = dp[i-1] +1 if A[i] - A[i-1] == A[i-1] - A[i-2]，总的等差数列个数=sum(dp)