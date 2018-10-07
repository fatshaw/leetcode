https://leetcode.com/problems/search-in-rotated-sorted-array/description/  
simple idea: split coordinate into three parts

let MAX=max(nums); L = 0; R  = nums.length - 1; M = (l+r)/2, then coordinate is splitted into three parts with two conditions
1. L ----- M --- MAX ---- R
2. L ------------ MAX ---- M ----- R

for the first condition:  if L < target < M then R = M -1; else L = M+1
second condition:       if target < L and M < target then L= M+1; else R = M -1;