func min(a, b int) int {
	if a <= b {
		return a
	}
	return b
}

func shortestToChar(S string, C byte) []int {
	N := len(S)
	forces := make([]int, N)
	force := N
	for i := 0; i < N; i++ {
		if S[i] == C {
			force = 0
		} else {
			force = force + 1
		}
		forces[i] = force
	}

	for i := N - 1; i >= 0; i-- {
		if S[i] == C {
			force = 0
		} else {
			force = force + 1
		}
		forces[i] = min(forces[i], force)
	}

	return forces

}