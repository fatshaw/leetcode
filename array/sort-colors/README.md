https://leetcode.com/problems/sort-colors/description/  
1. count排序，需要数组两次需要
2. 循环一次，使用两个下标indexOfZero,indexOfOne记录下一个0和1的下标。先记录当前元素v=nums[i]，无论当前元素是多少，设置当前元素为2。如果当前元素<2，则根据indexOfZero,indexOfOne将0或者1设置到响应位置。并且响应的indexOfZero,indexOfOne增加1.  

思考   
由于对于每个元素遍历过程中，默认会将当前元素设为2，则可以保证元素2一定会位于数组最后  
巧妙的使用了两个下标记录0和1的位置，如果当前元素不是2，则根据下标设置响应的值
