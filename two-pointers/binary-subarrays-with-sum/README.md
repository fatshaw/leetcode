https://leetcode.com/problems/binary-subarrays-with-sum/description/  
cs = sum of value till current node.
record prefix[cs] = count of sum = cs, then end with current index, count of sum = k is equal to prefix[cs-k], so total count of sum = k is sum of all prefix[cs-k]