https://leetcode.com/problems/palindromic-substrings/description/  
以每个字符为中心，向两边扩展，计算回文。为了避免存在奇数偶数情况，将所有字符中间插入#，即一定是奇数字符。然后对于每一个字符，从两边扩展，计算回文个数。优化算法是manacher's算法，过于复杂