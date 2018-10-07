https://leetcode.com/problems/jump-game/  
1. dp bottom-up方法  
dp[i]表示从i开始是否可以到达数组最后一个元素。则dp[i] = dp[i+k] for k = 1 ~ nums[i]，即下标为i元素开始是否可以到达数组尾部是看i+1~i+nums[i]这几个元素是否可以到达数组底部。

2. 贪心greedy
有dp可以看出，如果当前元素i是否可以达到数组底部取决于i+1~i+nums[i]是否可以达到数组底部。所以记录下最左边的可以到达数组底部的下标lastpos，如果i+nums[i] >= lastPos，则表示i元素可以达到数组底部。并且更新lastpos=i