https://leetcode.com/problems/friends-of-appropriate-ages/description/  
对数组进行排序
从数组尾部进行遍历，对于每一个元素，通二分查找找到元素ages[j] >= (int) (0.5 * ages[i] + 7 + 1),如果有相同元素满足条件，则找到最左边的下标j
由于相同的元素可以重复request，所以通过一个map记录重复相同元素的个数，然后响应增加计数