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
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.compute(i, (key, v) -> v == null ? 1 : v + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(k, (a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (pq.size() == k && e.getValue() > pq.peek().getValue()) {
                pq.poll();
                pq.offer(e);
            }
            if (pq.size() < k) pq.offer(e);
        }
        // System.out.println(pq.toString());
        return pq.stream().mapToInt(i -> i.getKey()).toArray();
    }
}
// @lc code=end

