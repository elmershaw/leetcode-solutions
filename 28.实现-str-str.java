<<<<<<< HEAD
=======
import java.util.Arrays;

>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
<<<<<<< HEAD
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

=======
    private int[] next;

    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) {
            return 0;
        }
        next = new int[m];
        Arrays.fill(next, -1);
        createNext(needle);
        int j = -1;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)) {
                j = next[j];
            }
            if (haystack.charAt(i) == needle.charAt(j + 1)) {
                j++;
            }
            if (j == m - 1) {
                return i - m + 1;
            }
            // if (j == m) {
            //     return i - j;
            // }
            // char c = haystack.charAt(i); 
            // if (c != needle.charAt(j)) {
            //     if (j > 0) {
            //         j = next[j - 1];
            //         i--;
            //     } else {
            //         j = -1;
            //     }
            // }
            // j++;
        }
        // if (j == m) {
        //     return n - j;
        // }
        return -1;
    }

    private void createNext(String s) {
        for (int i = 1; i < s.length(); i++) {
            int idx = next[i - 1];
            while (idx >= 0) {
                if (s.charAt(i) == s.charAt(idx + 1)) {
                    next[i] = idx + 1;
                    break;
                }
                idx = next[idx];
            }
            if (idx < 0 && s.charAt(i) == s.charAt(0)) {
                next[i] = 0;
            }
        }
    }
    
}
// @lc code=end
>>>>>>> cb5f86a (add solutions from home PC)
