滑动窗口题目  
记录sum表示left到当前元素的和。如果sum>s，则记录left到当前元素的长度，并且sum-nums[left]，知道sum<s，记录left到当前元素长度最小值