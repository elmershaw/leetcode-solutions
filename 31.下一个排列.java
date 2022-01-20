/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    // 交换
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    // [i + 1, nums.length) 内元素升序排序
                    Arrays.sort(nums, i + 1, nums.length);
                    return;
                }
            }
        }
        //Arrays.sort(nums); // 不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
}
// @lc code=end
