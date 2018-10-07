https://leetcode.com/problems/min-cost-climbing-stairs/description/   
在Climbing Stairs基础上增加了cost，问题分解为  
sum[i] 到达i节阶梯的花费，sum[i] = min(sum[i-1]+cost[i-1],sum[i-2]+cost[i-2])