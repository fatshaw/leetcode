
func findLongestWord(s string, d []string) string {
	ret := ""
	for _, dic := range d {
		i := 0
		j := 0
		for ; i < len(s) && j < len(dic); {
			if s[i] != dic[j] {
				i++
			} else {
				i++
				j++
			}
		}

		if j != len(dic) {
			continue
		}

		if len(dic) > len(ret) {
			ret = dic
		} else if len(dic) == len(ret) && strings.Compare(dic, ret) < 0 {
			ret = dic
		}
	}

	return ret

}
