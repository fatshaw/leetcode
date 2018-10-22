https://leetcode.com/problems/partition-labels/description/  
记录每个字符最右边出现的位置。
遍历数组，然后对于每个字符计算最右边达到的边界，如果当前字符和最右边边界相同，即可以分割。