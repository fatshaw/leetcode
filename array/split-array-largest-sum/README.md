将数组分隔为连续的m段,使得每一段的和的最大值最小
1. 每一段和的范围一定属于[max(nums),sum(nums)]
2. 所以本题可以分解为两道题目：

- 给定一个数组int[]nums，份数m，最大值max，需要将数组nums切分为连续的最多m份，每一份的和<=max
- Given a lower bound (left), an upper bound (right), an unknown bool array (B), and an API uses i as input and tells you whether B[i] is true. If we know there exists an index k, that B[i] is false when i < k, and B[i] is true when i >= k. What is the fastest way to find this k (the lower bound)?

第一问通过贪心算法，不断累加数组，如果超过>max，之前的数组作为一段，并重新开始累加，最多形成m份数组   

第二问可以用二分查找方法找到k  

组合这两个问题，原问题是找到一个数k，满足将原数组切分为m份，并且每一份的和<=k,使得k最小。由于k>=每一份数组的和，即max(nums)<=k<=sum(nums)。
