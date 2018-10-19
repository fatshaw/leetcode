https://leetcode.com/problems/sqrtx/description  
二分查找。l=0,r=x+1,结果在(l,r)之间。m=(l+r)/2, 如果 m * m == x, 表示m是结果，返回。 m*m < x, 则表示m可能是结果，但是不确定，l=m,如果m * m > x, 表示m肯定不是结果，则r=m。当l < r-1 时循环找m，否则返回l