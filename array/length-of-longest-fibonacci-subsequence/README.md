https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/description/  
排序数组，找到最长长度Fibonacci数列  
特点  
1. 排序
2. 当前元素结尾的最长长度和之前数组计算结果相关
3. 不同下表组合结果不同，所以结果是个二维的  

dp[i][j] = A[i]和A[j]组合形成的Fibonacci最长数列，则  
dp[i][j] = max(dp[j][k] + 1, 3) if A[i] = A[j] + A[k]  
为了获取A[i] - A[j]是否存在数组中，将数组A转化为map[v,index], 则k=map[A[i]-A[j]]，并且如果k>=j，可以忽略k，因为k必须在j的左边（剪枝）