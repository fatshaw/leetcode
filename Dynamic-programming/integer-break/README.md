https://leetcode.com/problems/integer-break/description/  
1. f(n) = x*f(n-x),记录已经计算过得结果dp[n] = f(n)，即dp[n] = max(dp[x] * dp[n-x]) for x = 2 - (n+1)/2
2. 对于最后结果，一定只存在2或者3，因为如果存在4，则可以用2*2代替，如果存在大于4的，可以通过分隔后获取更大的乘积。由于3 * 3 > 2 * 2 * 2，所以肯定优先选择3.