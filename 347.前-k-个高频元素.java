import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.compute(i, (key ,v) -> v == null ? 1 : v + 1);
        }
        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k, (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue()));
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            queue.offer(e);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int i = 0;
        while (!queue.isEmpty()) {
            ans[i++] = queue.poll().getKey();
        }
        return ans;
    }
}
// @lc code=end

