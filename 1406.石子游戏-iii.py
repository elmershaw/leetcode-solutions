#
# @lc app=leetcode.cn id=1406 lang=python3
#
# [1406] 石子游戏 III
#

# @lc code=start
class Solution:
    def stoneGameIII(self, stoneValue: List[int]) -> str:
        n = len(stoneValue)
        dp0, dp1, dp2 = 0, stoneValue[n - 1], 0
        sum = stoneValue[n - 1]
        if n >= 2:
            sum += stoneValue[n - 2]
            dp0 = sum - min(dp1, dp2)
        else:
            dp0 = dp1
        for i in range(n - 3, -1, -1):
            sum += stoneValue[i]
            temp = dp0
            dp0 = sum - min(dp0, dp1, dp2)
            dp2 = dp1
            dp1 = temp
        if dp0 * 2 > sum:
            return 'Alice'
        elif dp0 * 2 < sum:
            return 'Bob'
        else:
            return 'Tie'

# @lc code=end

