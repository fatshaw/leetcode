// 二分法
func mySqrt(x int) int {
	l := 0
	r := x + 1
	for l < r-1 {
		m := (l + r) / 2
		if m*m == x {
			return m
		} else if m*m < x {
			l = m
		} else {
			r = m
		}
	}
	return l
}

// Newton‘s method
func mySqrt(x int) int {
	g := x
	for g*g > x {
		g = (g + x/g) / 2
	}
	return g
}

