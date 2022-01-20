/*
 * @lc app=leetcode.cn id=977 lang=golang
 *
 * [977] 有序数组的平方
 */

// @lc code=start
func sortedSquares(nums []int) []int {
	n := len(nums)
	ans := make([]int, n)
	//var ans [n]int
	l := 0
	r := n - 1
	index := n - 1
	for l <= r {
		if nums[l] * nums[l] > nums[r] * nums[r] {
			ans[index] = nums[l] * nums[l]
			index -= 1
			l += 1
		} else {
			ans[index] = nums[r] * nums[r]
			index -= 1
			r -= 1
		}
	}
	return ans
}
// @lc code=end

