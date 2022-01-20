import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> idx = null;
            if (!map.containsKey(nums[i])) {
                idx = new ArrayList<>();
                map.put(nums[i], idx);
            }
            idx = map.get(nums[i]);
            idx.add(i);
        }
        

        // System.out.println(map.toString());
        int[] ans = new int[2];
        for (int i : nums) {
            int value = target - i;
            if (map.containsKey(value)) {
                ans[0] = map.get(i).get(0);
                if (value == i) {
                    if (map.get(i).size() > 1) {
                        ans[1] = map.get(i).get(1);
                        break;
                    } else {
                        continue;
                    }
                }
                ans[1] = map.get(value).get(0);
                break;
            }
        }
        return ans;
    }
}
// @lc code=end

