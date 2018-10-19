https://leetcode.com/problems/sqrtx/description  
1. 二分查找。l=0,r=x+1,结果在(l,r)之间。m=(l+r)/2, 如果 m * m == x, 表示m是结果，返回。 m*m < x, 则表示m可能是结果，但是不确定，l=m,如果m * m > x, 表示m肯定不是结果，则r=m。当l < r-1 时循环找m，否则返回l

2. 牛顿方法 while(g*g>x) g = (g + x/g) / 2; return g; 当g * g > x时，表示g比答案大，利用g = (g+x/g) / 2的方式使得g离答案更近一点。因为假设答案是m, g > m, 则 x/g < m，则 g=(g+x/g)/2使得g变小，离m越近 