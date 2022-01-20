#
# @lc app=leetcode.cn id=1690 lang=python3
#
# [1690] 石子游戏 VII
#

# @lc code=start
class Solution:
    def stoneGameVII(self, stones: List[int]) -> int:
        n = len(stones)
        @lru_cache(None)
        def A(i, j):
            if i == j:
                return 0
            if i+1 == j:
                return max(stones[i], stones[j])
            return max(min(stones[i+1]+A(i+2, j), stones[j]+A(i+1, j-1)), min(stones[i]+A(i+1, j-1), stones[j-1]+A(i, j-2)))       
        return A(0, n-1)
# @lc code=end

