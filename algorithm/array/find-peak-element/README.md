找到数组peak，条件是元素大于相邻的元素，即nums[i-1]< nums[i] > nums[i+1]，即找到第一个i，使得nums[i] > nums[i+1]即可。时间复杂度为O(n)  
另一种巧妙的方式是利用二分查询方式，mid=(l+r)/2,如果nums[mid] > nums[mid+1]表示peak是mid或者在mid左边，则r=mid，反之在右边,l=mid+1，直到l==r即找到peak  
思考  
巧妙的利用了二分查找，数组并没有排序，但是利用了局部排序特点，即peak比他右边的数大