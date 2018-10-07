https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/  
双指针方式，一个指针指向当前元素，一个指向下一个满足条件的下标next  
如果当前元素n>nums[next-2]，则表示当前元素满足条件，即当前元素加入结果集中不会造成连续三个相同元素