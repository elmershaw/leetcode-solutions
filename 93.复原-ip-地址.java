import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {
<<<<<<< HEAD
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return result; // 算是剪枝了
        backTrack(s, 0, 0);
        return result;
    }

    // startIndex: 搜索的起始位置， pointNum:添加逗点的数量
    private void backTrack(String s, int startIndex, int pointNum) {
        if (pointNum == 3) {// 逗点数量为3时，分隔结束
            // 判断第四段⼦字符串是否合法，如果合法就放进result中
            if (isValid(s,startIndex,s.length()-1)) {
                result.add(s);
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);    //在str的后⾯插⼊⼀个逗点
                pointNum++;
                backTrack(s, i + 2, pointNum);// 插⼊逗点之后下⼀个⼦串的起始位置为i+2
                pointNum--;// 回溯
                s = s.substring(0, i + 1) + s.substring(i + 2);// 回溯删掉逗点
            } else {
                break;
=======
    private List<String> ans;
    private StringBuilder sb;

    public List<String> restoreIpAddresses(String s) {
        ans = new ArrayList<>();
        sb = new StringBuilder();
        backtracking(s, 0, 0);
        return ans;
    }

    private void backtracking(String s, int index, int size) {
        if (size == 3) {
            if (isValid(s, index, s.length() - 1)) {
                ans.add(sb.toString() + s.substring(index, s.length()));
            }
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isValid(s, index, i)) {
                String t = s.substring(index, i + 1) + '.';
                sb.append(t);
                // System.out.println(sb.toString());
                backtracking(s, i + 1, size + 1);
                sb.delete(sb.length() - (i + 2 - index), sb.length());
>>>>>>> cb5f86a (add solutions from home PC)
            }
        }
    }

<<<<<<< HEAD
    // 判断字符串s在左闭⼜闭区间[start, end]所组成的数字是否合法
    private Boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) { // 0开头的数字不合法
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
=======
    private boolean isValid(String s, int l, int r) {
        if (l > r) return false;
        if (s.charAt(l) == '0' && r != l) {
            return false;
        }
        int value = 0;
        for (int i = l; i <= r; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
            value = value * 10 + s.charAt(i) - '0';
            if (value > 255) {
>>>>>>> cb5f86a (add solutions from home PC)
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

