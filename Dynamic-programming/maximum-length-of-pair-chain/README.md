两种解法：  
1. dp
  dp[i] 表示i结尾的最长链长度，则对于dp[j]，如果pairs[j][0] > pairs[i][1]，则pairs[j]可以和pairs[i]链接起来。dp[j]是pairs[j]和之前所有pairs[i]能够形成的最大链,dp[j] = max(dp[i]+1，dp[j])
2. greedy
  如果pairs[j][0] > max(pairs[i][1])，则pairs肯定可以和pairs[max][1]链接。所以需要记录到目前节点i之前最大pairs[i][1]