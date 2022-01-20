/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        int[] next = new int[needle.length()];
        int j = -1;
        next[0] = j;
        for (int i = 1; i < next.length; i++) {
            while (j >= 0 && needle.charAt(j+1) != needle.charAt(i)) {
                j = next[j];
            }
            if (needle.charAt(j+1) == needle.charAt(i)) {
                j++;
            }
            next[i] = j;
        }
        int p = -1;
        for(int i = 0; i<haystack.length();i++){
            while(p>=0 && haystack.charAt(i) != needle.charAt(p+1)){
                p = next[p];
            }
            if(haystack.charAt(i)==needle.charAt(p+1)){
                p++;
            }
            if(p==needle.length()-1){
                return (i-needle.length()+1);
            }
        }
        return -1;
    }
}
// @lc code=end

