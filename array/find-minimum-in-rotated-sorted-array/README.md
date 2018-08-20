排序数组，通过二分查询方式  
如果nums[right] > nums[left]，则表示left - right排序的，直接返回nums[left]。  
如果nums[m] > nums[r], 则表示需要找到最小值在[m+1,right]之间，l=m+1  
如果nums[m] < nums[r], 则表示最小值在[left - m]之间，r = m;  
当l>=r退出，返回nums[l]  
