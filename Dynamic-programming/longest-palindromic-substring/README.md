https://leetcode.com/problems/longest-palindromic-substring/description/  
manacher算法  
首先将数组元素个数变为奇数，通过插入在每个元素的左右插入#，因为如果是奇数个元素，是的回文的中心左右半径一定相同，不用考虑偶数问题。  
比较简单的方式是以i为中心，向两边扩展，找回文，记录最长的回文。时间复杂度为O(n^2)  
可以通过manacher算法做优化，记录dp[id]表示以id为中心可以得到的回文半径，则：  
dp[j] = j < i + dp[id]/2 ? min( dp[2*id - j] , id+dp[id]/2-j ) : 1  
这样就不用每次从i开始一步步向左右遍历，可以跳过dp[i]的长度开始遍历。