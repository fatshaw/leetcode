https://leetcode.com/problems/4sum/description/  
4数和，在3数和的基础上，先对数组排序，确定一个数x后，在对剩余的数利用3sum找到sum=target-x的三个数，合并x为结果的4个数  
可以优化：
1. 找到整个数组最大值max
2. 对于确定的x，如果x+3*max<target，则表示x过小了
3. 对于确定的x，如果4*x>target，则表示x过大了