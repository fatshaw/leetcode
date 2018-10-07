https://leetcode.com/problems/minimum-path-sum/description/  
grid[i][j]表示到达i,j所需要的最小sum，则  
grid[i][j] = min(grid[i-1][j],grid[i][j-1]) + grid[i][j]  
对于第一行，没有上方数值，则grid[0][i] = grid[0][i-1]+grid[0][i]  
对于第一列，没有左边数值，则grid[i][0] = grid[i-1][0]+grid[i][0]