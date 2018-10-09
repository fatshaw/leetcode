func partitionLabels(S string) []int {
	rightPositionOfLetter := make(map[byte]int)
	for i := range S {
		rightPositionOfLetter[S[i]] = i
	}
	left := 0
	right := -1
	var splitedCount []int
	for i := range S {
		tmp := rightPositionOfLetter[S[i]]
		if tmp > right {
			right = tmp
		}
		if i == right {
			splitedCount = append(splitedCount, right-left+1)
			left = i + 1
		}
	}
	return splitedCount
}
