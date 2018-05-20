func maxProfit(k int, prices []int) int {
	if prices == nil || len(prices) <= 0 {
		return 0
	}

	if k > len(prices)/2 {
		return quickSlove(prices)
	}

	n := len(prices)
	prof := make([][]int, k+1, k+1)
	for i := 0; i < k+1; i++ {
		prof[i] = make([]int, n, n)
	}

	for r := 1; r <= k; r++ {
		m := prof[r][0] - prices[0]
		for i := 1; i < len(prices); i++ {
			prof[r][i] = max(prof[r][i-1], prices[i]+m)
			m = max(m, prof[r-1][i-1]-prices[i])
		}
	}

	return prof[k][n-1]
}

func max(a int, b int) int {
	if a > b {
		return a
	}
	return b
}

func quickSlove(prices []int) int {
	profile := 0
	for i := 1; i < len(prices); i++ {
		if prices[i] > prices[i-1] {
			profile += prices[i] - prices[i-1]
		}
	}
	return profile
}


