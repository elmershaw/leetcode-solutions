<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

=======
>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
<<<<<<< HEAD
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int tmp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (tmp < target) {
                        left++;
                    } else if (tmp > target) {
                        right--;
                    } else {
                        ans.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[right] == nums[right-1]) right--;
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        right--;
                        left++;
                    }

                }
                
=======
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1;
                int r = n - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum > target) {
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        ans.add(List.of(nums[i], nums[j], nums[l], nums[r]));
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        r--;
                        l++;
                    }
                }
>>>>>>> cb5f86a (add solutions from home PC)
            }
        }
        return ans;
    }
}
// @lc code=end

