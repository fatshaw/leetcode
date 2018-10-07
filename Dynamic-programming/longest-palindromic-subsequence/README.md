https://leetcode.com/problems/longest-palindromic-subsequence/description/  子序列问题，有点类似LCS，LCS是两个字符串求最长子序列。本题是最长回文子序列，即自己左边和右边比。
假设dp[i][j]表示i,j最长回文子序列，则dp[i][j] = dp[i+1][j-1] + 2，if s[i] == s[j]。否则dp[i][j] = max(dp[i+1][j],dp[i][j-1])

思考总结：
1. 回文问题，肯定不能穷举递归，太慢
2. 对于两次遍历一维数组，不同遍历顺序得到不同结果
```
  1. 这个模式是第一位固定，第二位不断递增，适合没有前后依赖的模式
  for(i=0;i<lenght;i++){
    for(j=i;j<length;j++){

    }
  }

  2. 第一位固定，第二位从第一位开始，不断减少至0，适合后面计算依赖前面的结果情况
  for(i=0;i<lenght;i++){
    for(j=i;j>=0;j--){

    }
  }
  本题使用第二种方式，因为dp[i][j] = dp[i+1][j-1]+2，dp[i][j]依赖dp[i+1][j-1]，如果用第一种方式，计算dp[i][j]的时候，dp[i+1][j-1]还没有计算
```