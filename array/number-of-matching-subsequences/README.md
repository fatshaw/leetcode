https://leetcode.com/problems/number-of-matching-subsequences/description/  
用map记录S中每个字符出现的下标，因为可能有重复的字符，所有需要使用数组保存下标  
对于每一个字典中的字符串w，通过map找到每个字符在S中的下标，如果每个字符都在map中存在，冰清下标出现的顺序是有序的，则表示w是S的子串