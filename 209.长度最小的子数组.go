/*
 * @lc app=leetcode.cn id=209 lang=golang
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
func minSubArrayLen(target int, nums []int) int {
	i := 0
	n := len(nums)
	sum := 0
	res := n + 1
	for j := 0; j < n; j++ {
		sum += nums[j]
		for sum >= target {
			tmp := j - i + 1
			if tmp < res {
				res = tmp
			}
			sum -= nums[i]
			i++
		}
	}
	if res == n + 1 {
		return 0
	}
	return res
}
// @lc code=end

