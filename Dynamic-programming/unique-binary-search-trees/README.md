https://leetcode.com/problems/unique-binary-search-trees/description/  
二叉树，对于数字n，先确定根节点数字k，然后1,k-1属于左子树，k+1,n属于右子树。这种情况下可能产生的bst个数为dp[k-1]*dp[n-k]，dp[i]表示对于数字i可以获得的bst个数。所以
dp[3] = dp[0] * dp[2] + dp[1] * dp[1] + dp[2] * dp[0]
dp[4] = dp[0] * dp[3] + dp[1] * dp[2] + dp[2] * dp[1] + dp[3] * dp[0]
