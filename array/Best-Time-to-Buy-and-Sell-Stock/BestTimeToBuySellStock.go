func maxProfit(prices []int) int {
	min := math.MaxInt32
	max := 0
	for _, x := range prices {
		temp := x - min
		if temp > max {
			max = temp
		}
		if x < min {
			min = x
		}
	}

	return max
}