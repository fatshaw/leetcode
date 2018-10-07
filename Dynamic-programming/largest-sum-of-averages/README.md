https://leetcode.com/problems/largest-sum-of-averages/description/  
将数组分为三段，使得每段的平均值相加最大，使用动态规划计算
首先计算sum[i]表示num[0]~num[i]的和：sum(0,i)
dp[i][k]表示从下标i开始分为k段的平均值和最大值
则dp[j][k] = max(dp[i][k-1] + avg(j,i-1)),即在i处分隔，使得j,i-1的平均值+dp[i][k-1]的值最大