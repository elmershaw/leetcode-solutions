#
# @lc app=leetcode.cn id=35 lang=python3
#
# [35] 搜索插入位置
#

# @lc code=start
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums)
        while l < r:
            m = (r - l) // 2 + l
            if nums[m] == target:
                return m
            if nums[m] < target:
                l = m + 1
            else:
                r = m
        return l
# @lc code=end

