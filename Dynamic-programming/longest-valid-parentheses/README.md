dp[i]表示已a[i]结尾的最长LVP  
如果a[i] == '(' 则a[i] = 0  
如果a[i] == ')' 并且a[i-dp[i-1]-1] = '('，则dp[i] = dp[i-1]+2+dp[i-dp[i-1]-2]