<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
=======
import java.util.List;
import java.util.Set;
>>>>>>> cb5f86a (add solutions from home PC)

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
<<<<<<< HEAD

        Set<Integer> set1 = new HashSet<>(nums1.length);
        //Set<Integer> set2 = new HashSet<>(nums2.length);
        Set<Integer> ans = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int j : nums2) {
            if (set1.contains(j)) {
                ans.add(j);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
=======
        Set<Integer> visited = new HashSet<>();
        int[] visited_arr = nums1;
        int[] traverse_arr = nums2;
        if (nums1.length > nums2.length) {
            visited_arr = nums2;
            traverse_arr = nums1;
        }
        for (int i = 0; i < visited_arr.length; i++) {
            visited.add(visited_arr[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i : traverse_arr) {
            if (visited.contains(i)) {
                ans.add(i);
                visited.remove(i);
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

