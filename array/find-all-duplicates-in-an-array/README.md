https://leetcode.com/problems/find-all-duplicates-in-an-array/  
类似于FindAllNumbersDisappearInArray,如果x出现，则对应的nums[x-1]*=-1，因为出现两次，所以当第二次出现x，则nums[x-1]应该为负数。