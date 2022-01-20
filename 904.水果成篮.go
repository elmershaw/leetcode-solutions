/*
 * @lc app=leetcode.cn id=904 lang=golang
 *
 * [904] 水果成篮
 */

// @lc code=start
func totalFruit(fruits []int) int {
	l := 0
	res := 0
	fruitMap := make(map[int]int)
	for r := 0; r < len(fruits); r++ {
		fruitMap[fruits[r]]++
		for len(fruitMap) > 2 {
			fruitMap[fruits[l]]--
			if fruitMap[fruits[l]] == 0{
				delete(fruitMap, fruits[l])
			}
			l++
		}
		crtLen := r - l + 1
		if (crtLen > res) {
			res = crtLen
		}
	}
	return res
}
// @lc code=end

