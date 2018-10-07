https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/  
贪心算法，只要price[i+1]>price[i]，则profile+=price[i+1]-price[i]