
func numRescueBoats(people []int, limit int) int {
	sort.Ints(people)
	count := 0
	lo := 0
	hi := len(people) - 1
	for lo <= hi {
		if people[hi]+people[lo] <= limit {
			lo++
		}
		count++
		hi--
	}
	return count
}
