https://leetcode.com/problems/unique-paths/description/  
dp[i][j]表示到底uniquePath(i,j)的路径数量，则dp[i][j] = dp[i-1][j] + dp[i][j-1]。dp[i][0] = 1,dp[0][1] = 1。