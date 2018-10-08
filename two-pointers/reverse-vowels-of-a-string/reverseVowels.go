func reverseVowels(s string) string {
	sChars := []rune(s)
	i := 0
	j := len(sChars) - 1
	vowels := map[byte]bool{'a': true, 'e': true, 'i': true, 'o': true, 'u': true, 'A': true, 'E': true, 'I': true, 'O': true, 'U': true}
	for i < j {
		for i < j {
			_, ok := vowels[byte(sChars[i])]
			if ok {
				break
			}
			i++
		}
		for i < j {
			_, ok := vowels[byte(sChars[j])]
			if ok {
				break
			}
			j--
		}
		if i < j {
			t := sChars[i]
			sChars[i] = sChars[j]
			sChars[j] = t
			i++
			j--
		}
	}
	return string(sChars)
}
