https://leetcode.com/problems/partition-to-k-equal-sum-subsets/description/  
将数组分隔为k部分，每一部分的和相同  
通过递归枚举的方式，遍历nums数组，先找到和为target的元素，然后在剩余的元素中找到k-1组和为target的元素。