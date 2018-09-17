dp[i][j]表示选手A在nums[i] ~ nums[j]中相对选手B获取到比分差值，则dp[i][j] = max(nums[i] - dp[i+1][j] , nums[j] - dp[i][j-1])，对于dp[i][i] = nums[i]
时间O(n^2),空间O(n^2)

## 思考
由于遍历中对于每一个元素nums[i]，j从i~nums.length-1,一直更新的是dp[i][j]，所以其实只要更新dp[j]即可。可以缩减空间至O(n),对于类似题目，可以考虑是否需要降低空间。