https://leetcode.com/problems/valid-triangle-number/description/  
对于合法有效的三角形的三条边的条件是： a-b < c < a+b  
所以类似于3sum一样，找到三个数符合条件，即先找到a,b 然后通过二分查找元素i < c。  
不能使用java原生的Arrays.binarySearch，因为如果数组中有重复元素，该函数可能返回元素下标不定  
