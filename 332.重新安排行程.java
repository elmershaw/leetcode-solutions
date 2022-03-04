import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

/*
 * @lc app=leetcode.cn id=332 lang=java
 *
 * [332] 重新安排行程
 */

// @lc code=start
class Solution {
    private Map<String, Map<String, Integer>> map = new HashMap<>();
    private List<String> ans = new ArrayList<>();
    // private List<String> tmp = new ArrayList<>();
    private int n;

    public List<String> findItinerary(List<List<String>> tickets) {
        n = tickets.size();
        for (List<String> l : tickets) {
            map.putIfAbsent(l.get(0), new TreeMap<>());
            map.get(l.get(0)).compute(l.get(1), (k, v) -> v == null ? 1 : v  + 1);
        }
        // System.out.println(map.toString());
        ans.add("JFK");
        backtracking("JFK");
        return ans;
    }

    private boolean backtracking(String cur) {
        if (ans.size() == n + 1) {
            return true;
        }
        if (!map.containsKey(cur)) return false;
        for (Map.Entry<String, Integer> e : map.get(cur).entrySet()) {
            if (e.getValue() > 0) {
                // map.get(cur).compute(e.getKey(), (k, v) -> --v);
                e.setValue(e.getValue() - 1);
                ans.add(e.getKey());
                if (backtracking(e.getKey())) return true;
                ans.remove(ans.size() - 1);
                // map.get(cur).compute(e.getKey(), (k, v) -> ++v);
                e.setValue(e.getValue() + 1);
            }
        }
        return false;
    }
}
// @lc code=end
