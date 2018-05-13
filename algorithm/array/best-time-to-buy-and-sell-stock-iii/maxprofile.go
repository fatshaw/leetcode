

function maxProfile() int {
	if prices == nil || len(prices) <= 0 {
		return 0
	}

	n := len(prices)
	prof := make([]int, n, n)
	for r := 0; r < 2; r++ {
		m := prof[0] - prices[0]
		for i := 1; i < len(prices); i++ {
			m = max(m, prof[i]-prices[i])
			prof[i] = max(prof[i-1], prices[i]+m)
		}
	}

	return prof[n-1]
}
