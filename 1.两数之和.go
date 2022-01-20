/*
 * @lc app=leetcode.cn id=1 lang=golang
 *
 * [1] 两数之和
 */

// @lc code=start
func twoSum(nums []int, target int) []int {
	seen := make(map[int]int)
	for i, v := range nums {
		if preIndex, ok := seen[target - v]; ok {
			return []int{preIndex, i}
		}
		seen[v] = i
	}
	return []int{}
}
// @lc code=end

