#
# @lc app=leetcode.cn id=283 lang=python3
#
# [283] 移动零
#

# @lc code=start
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        slowPointer = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[slowPointer], nums[i] = nums[i], nums[slowPointer]
                slowPointer+=1
        # for j in range(slowPointer, len(nums)):
        #     nums[j] = 0
# @lc code=end

