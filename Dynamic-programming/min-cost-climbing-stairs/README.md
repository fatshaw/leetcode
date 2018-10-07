https://leetcode.com/problems/min-cost-climbing-stairs/description/  
sum[i]表示到达i阶梯花费的最小代价,则sum[i] = min(sum[i-1]+cost[i-1],sum[i-2]+cost[i-2]),即到达第i-1阶梯的花费+第i-1阶梯的花费和到达第i-2阶的花费和第i-2阶的花费中较小的花费