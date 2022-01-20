#
# @lc app=leetcode.cn id=1140 lang=python3
#
# [1140] 石子游戏 II
#
import sys
from typing import List
# @lc code=start
class Solution:
    def stoneGameII(self, piles: List[int]) -> int:
        n = len(piles)
        cache = dict()
        def solve(s, m):
            if (s, m) in cache:
                return cache[(s, m)]
            if s >= n:
                return 0
            if s + 2 * m >= n:
                return sum(piles[s:])
            best = -sys.maxsize - 1
            for x in range(1, m * 2 + 1):
                best = max(best, sum(piles[s:s + x]) - solve(s + x, max(x, m)))
            cache[(s, m)] = best
            return best
        total = sum(piles)
        return (total + solve(0, 1)) // 2

# @lc code=end

