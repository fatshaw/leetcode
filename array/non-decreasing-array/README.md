https://leetcode.com/problems/non-decreasing-array/description/  
找到降低点。如果出现两个降低点，不满足要求，返回false。如果没有降低点，返回true    
如果只存在一个降低点p，并且满足p==0或者p==nums.length-2，则返回true，因为降低点在开头或者结尾，只要改变一个值即可。如果p是位于中间，如果nums[p+1] > nums[p-1]，则降低nums[p]=nums[p+1]。如果nums[p+2]>nums[p]，则提高nums[p+1]=nums[p]