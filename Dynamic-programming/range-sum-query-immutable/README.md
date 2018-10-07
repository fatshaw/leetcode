https://leetcode.com/problems/range-sum-query-immutable/description/  
计算累积和sums[i] = nums[0] + nums[1] + ...+ nums[i]，则rangesum(i,j) = sums[j] - sums[i-1]