https://leetcode.com/problems/subarray-sum-equals-k/description/  
求连续子序列和为k的个数。简单的两个for循环可以搞定。也可以通过一个map记录当前元素之前每个sum出现的次数。如果以当前元素结尾的子数组和为sum，则如果之前存在sum1=sum - k，则表示子数组个数增加1