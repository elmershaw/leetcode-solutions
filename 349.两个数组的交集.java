import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

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
    }
}
// @lc code=end

