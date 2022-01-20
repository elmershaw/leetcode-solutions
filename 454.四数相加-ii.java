import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> halfSum = new HashMap<>();
        int counts = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (halfSum.containsKey(i + j)) {
                    halfSum.put(i + j, halfSum.get(i + j) + 1);
                } else {
                    halfSum.put(i + j, 1);
                }
            }
        }
        for (int m : nums3) {
            for (int k : nums4) {
                if (halfSum.containsKey(-(m + k))) {
                    counts += halfSum.get(-(m + k));
                }
            }
        }
        return counts;
    }

}
// @lc code=end

