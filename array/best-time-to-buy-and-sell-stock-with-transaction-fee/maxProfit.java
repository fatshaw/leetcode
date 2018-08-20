public int maxProfit(int[] prices, int fee) {
  int hold = -prices[0];
  int cash = 0;
  for (int i = 1; i < prices.length; ++i) {
      cash = Math.max(cash, prices[i] + hold - fee);
      hold = Math.max(hold, cash - prices[i]);
  }
  return cash;
}