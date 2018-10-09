import "strings"

func isPalindrome(s string) bool {
	runes := []rune(strings.ToLower(s))
	i := 0
	j := len(runes) - 1
	for i < j {
		for ; !(('0' <= runes[i] && runes[i] <= '9') || ('a' <= runes[i] && runes[i] <= 'z')) && i < j; i++ {
		}
		for ; !(('0' <= runes[j] && runes[j] <= '9') || ('a' <= runes[j] && runes[j] <= 'z')) && i < j; j-- {
		}
		if runes[i] != runes[j] {
			return false
		}
		i++
		j--
	}
	return true
}