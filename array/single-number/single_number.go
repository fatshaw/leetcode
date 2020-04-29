package main

import (
	"fmt"
)

func singleNumber(nums []int) int {
	var r int = 0
	for i := 0; i < len(nums); i++ {
		r = r ^ nums[i]
	}
	return r
}

func main() {
	r := singleNumber([]int{2, 2, 4, 4, 1})
	fmt.Printf("%v\n", r)
}
