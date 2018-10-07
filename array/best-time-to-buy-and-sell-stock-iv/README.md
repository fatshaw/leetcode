https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/description/  
```
DP problem, prof[r][i] is the max profile with up to r transactions before time i.
prof[r][i] = max(prof[r][i-1], max(price[i] - price[j] + prof[r-1][j]) for 0<=j<i ) 
prof[i] = max(prof[i-1], price[i] + max(prof[r-1][j] - price[j]) for 0<=j<i )  
prof[i] = max(prof[i-1], prices[i] + m)
m = max(prof[r-1][j] - price[j]) = max profile with up to r-1 transaction and prices[i] as buying price in the next transaction at time i
```