https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/  
思路很直接，把words变成hashtable，由于word可能重复，所以hashtable存储每个word的个数  
遍历s[0:len(s) - len(words)*len(words[0])], 对于每个i+len(words[0])判断是否在hashtable中存在，如果存在hashtable中word对应的value--。如果hashtable中每个word的value都为0表示满足条件