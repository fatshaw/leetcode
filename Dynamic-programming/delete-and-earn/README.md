https://leetcode.com/problems/delete-and-earn/description/  
类似house rob, 将数组按1-10000进行排列，相邻的不能同时获取。用两个变量take,skip表示十分实用当前元素和不使用当前元素。dp公式为:  
take[i] = skip[i-1]+ i * count[i]
skip[i] = max(task[i-1],skip[i-1])

最后求max(skip[10000],take[10000])

可以看出，只要记录当前take，skip和上一个元素的take,skip即可。即take,skip,pre_take,pre_skip