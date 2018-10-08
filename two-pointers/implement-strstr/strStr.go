func strStr(haystack string, needle string) int {
	if len(needle) == 0 {
		return 0
	}
	runesHaystack := []rune(haystack)
	runesNeedle := []rune(needle)
	for i := 0; i < len(runesHaystack); i++ {
		runesNeedleIndex := 0
		for j := i; j < len(runesHaystack) && runesHaystack[j] == runesNeedle[runesNeedleIndex]; j++ {
			runesNeedleIndex++
			if runesNeedleIndex == len(runesNeedle) {
				return i
			}
		}

	}
	return -1
}