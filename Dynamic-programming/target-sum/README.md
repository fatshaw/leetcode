dp[]表示nums[i]元素取正或负数时从nums[0] ~ nums[i]所有可能得到的数的集合。dp[i]=c，表示和为i的个数为c
则对于元素nums[i+1]，产生合为e+nums[i+1]的个数为dp[e+nums[i+1]] += dp[e],产生合为e-nums[i+1]的个数为dp[e-nums[i+1]] += dp[e], 对于dp中所有元素e
最后取dp[S]的个数