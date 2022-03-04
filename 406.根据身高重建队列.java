import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=406 lang=java
 *
 * [406] 根据身高重建队列
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1, p2) -> {
            if (p1[0] == p2[0]) {
                return p1[1] - p2[1];
            }
            return p2[0] - p1[0];
        });
        List<int[]> ans = new LinkedList<>();
        for(int i = 0; i < people.length; i++) {
            ans.add(people[i][1], people[i]);
        }
        return ans.toArray(new int[people.length][]);
    }
}
// @lc code=end

