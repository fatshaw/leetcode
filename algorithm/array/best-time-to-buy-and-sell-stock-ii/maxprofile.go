func maxProfit(prices []int) int {
	profile := 0
	for i := 1; i < len(prices); i++ {
		if prices[i] > prices[i-1] {
			profile += prices[i] - prices[i-1]
		}
	}

	return profile
}