/*
 * @lc app=leetcode.cn id=76 lang=cpp
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
public:
    string minWindow(string s, string t) {
        const int n = s.length();
        const int m = t.length();
        vector<int> freq(128);
        for (char c : t) ++freq[c];
        int start = 0;
        int l = INT_MAX;    
        for (int i = 0, j = 0, left = m; j < n; ++j) {
            if (--freq[s[j]] >= 0) --left;
            while (left == 0) {
                if (j - i + 1 < l) {
                    l = j - i + 1;
                    start = i;
                }
                if (++freq[s[i++]] == 1) ++left;
            }
        }
        return l == INT_MAX ? "" : s.substr(start, l);
    }
};
// @lc code=end

