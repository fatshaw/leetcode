func findSubstring(s string, words []string) []int {
	ret := make([]int, 0)

	if len(s) == 0 || len(words) == 0 {
		return ret
	}

	wordLength := len(words[0])
	allLength := wordLength * len(words)

	for i := 0; i < len(s)-allLength+1; i++ {
		wordMap := make(map[string]int, len(words))
		for _, word := range words {
			wordMap[word] += 1
		}

		j := i
		for ; j < len(s)-wordLength+1; {
			tmpWord := s[j:j+wordLength]
			v, ok := wordMap[tmpWord]
			if !ok || v == 0 {
				break
			}

			wordMap[tmpWord] --
			j += wordLength
		}
		if j == i+allLength {
			ret = append(ret, i)
		}
	}

	return ret
}