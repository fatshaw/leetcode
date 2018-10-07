https://leetcode.com/problems/unique-paths-ii/description/  
接unique-path-i。dp[i][j]表示从[0][0]到[i][j]的路径数。则dp[i][j] = dp[i-1][j]+dp[i][j-1]。由于本题增加了阻碍，则当ob[i][j] = 1，则dp[i][j] = 0，即[i][j]不可达