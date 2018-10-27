https://leetcode.com/problems/edit-distance/description/  
dp[i][j] = min distance between word1[0:i] and word2[0:j], then  
dp[i][j] = min(dp[i-1][j]+1,dp[i][j-1]+1, dp[i-1][j-1] + (word1[i]==word2[j]?0:1))  
- dp[i-1][j] means remove word1[i]  
- dp[i][j-1] means remove word2[j] or add word2[j] after word1[i]  
- dp[i-1][j-1] means replace word1[i] with word2[j]  

we need find minimum edit distance from these three operations as the dp[i][j]