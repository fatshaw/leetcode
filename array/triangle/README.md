https://leetcode.com/problems/triangle/description/  
dp问题，dp[i]表示当前行第i个元素到最底层所需要的最小和。则dp[i] = min(dp[i],dp[i+1])+triangle[i][j]，即当前元素到最底层最小和为当前元素的两个子元素到达最底层最小和中较小的值+当前元素值。由于dp[i]只会在计算dp[i]的时候使用，所以被覆盖没有关系，不需要额外的空间。
思考  
从最底层开始遍历，思路很巧妙，相比从第0层开始遍历节省空间，因为从第0层开始遍历，需要保存上一层中当前元素的dp值。因为如果从上往下遍历，则dp[i] = min(dp[i],dp[i-1])+triangle[i][j],则dp[i]被覆盖后对于dp[i+1]计算会有影响，所以必须临时保存dp[i]