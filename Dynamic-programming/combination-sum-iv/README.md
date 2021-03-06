https://leetcode.com/problems/combination-sum-iv/description/  
组合问题，从一个集合nums中选择一组数字，和为target。dp[i]表示从集合中选择和为i的组合个数，则dp[n] = sum(dp[x]) where x = n - nums[i] for nums[i] <= n

## 思考
递归和dp是解决问题的两种方法，递归相对简单，但是由于有很多重复计算，函数调用，所以相对性能较差。往往会超时
dp的思路是在于记录中间结果，用于后面的计算  

* top-down方法
对于本题，如果使用递归，相对简单，f(n) = f(n-nums[0]) + f(n-nums[1]) + ... + f(n-nums[i]) for nums[i]<=n
这个叫top-down方法，自顶向下，将一个大问题分解为一个小问题，然后一步步到最小的问题，然后合并结果为大问题的结果。

* buttom-up方法
如果使用dp，则是自底向上，先计算小问题，f(1),f(2),f(3)...,然后计算f(n)，对于每个f(i)的计算结果存放于dp[i]中，用于下次计算使用
