
func pushDominoes(dominoes string) string {
	forces := make([]int, len(dominoes))
	chars := []rune(dominoes)

	force := 0
	N := len(dominoes)
	for i := 0; i < N; i++ {
		if dominoes[i] == 'R' {
			force = N
		} else if dominoes[i] == 'L' {
			force = 0
		} else {
			force = max(force-1, 0)
		}
		forces[i] += force
	}

	for i := N - 1; i >= 0; i-- {
		if dominoes[i] == 'L' {
			force = N
		} else if dominoes[i] == 'R' {
			force = 0
		} else {
			force = max(force-1, 0)
		}
		forces[i] -= force
	}

	for i := 0; i < N; i++ {
		if forces[i] == 0 {
			chars[i] = '.'
		} else if forces[i] > 0 {
			chars[i] = 'R'
		} else {
			chars[i] = 'L'
		}
	}

	return string(chars)
}


func max(a, b int) int {
	if a >= b {
		return a
	}
	return b
}