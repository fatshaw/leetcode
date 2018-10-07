https://leetcode.com/problems/game-of-life/description/  
遍历数组，按规则修改元素值，由于是要原地修改，所以必须保留原有值，则通过映射  
0 -> 0
1 -> 1
0 -> 2(0)
1 -> 3(1)
这样可以通过2，3找回原有数据

技巧  
由于需要遍历每个元素的周围8个元素，不要写8个if来判断边界，可以通过max(i-1,0)，min(j+1,board.length - 1)这样来判断是不是有边界问题.
