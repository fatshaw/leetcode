https://leetcode.com/problems/rotate-array/description/  
对于数组nums:[a,b,c,d,e],需要向右移动k位，那么数组最后的k位的元素会到数组的开头，然后数组开始的n-k位会到数组最后，所以想将整个数组反转，然后将前面k位反转，后面n-k位反转，即得到我们的答案  
eg. nums=a,b,c,d,e, k= 2.  
a,b,c,d,e - > e,d,c,b,a - > d,e,c,b,a - > d,e,a,b,c
