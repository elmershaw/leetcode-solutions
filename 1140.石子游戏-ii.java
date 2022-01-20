import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1140 lang=java
 *
 * [1140] 石子游戏 II
 */

// @lc code=start
class Solution {
    //private int m = 1;
    private FenwickTree ft;
    private List<Integer> l = new ArrayList<>();

    public int stoneGameII(int[] piles) {
        int n = piles.length;
        ft = new FenwickTree(n);
        for (int i = 0; i < n; i++) {
            ft.update(i + 1, piles[i]);
        }
        //return ft.query(n);
        scores(piles, 0, 1);
        return l.stream().mapToInt(x -> x).sum();
    }

    private int scores(int[] piles, int i, int m) {
        if (i >= piles.length - 2) return 0;
        int res = Integer.MIN_VALUE;
        for (int j = 1; i + j < piles.length && j <= 2 * m; j++) {
            int temp = ft.query(i + j) - ft.query(i) - scores(piles, i + j, Math.max(m, j));
            if (temp > res) {
                if (res != Integer.MIN_VALUE) l.remove(l.size() - 1);
                l.add(ft.query(i + j) - ft.query(i));
                res = temp;
            }
        }
        return res;
    }

    class FenwickTree {
        private int[] sums;

        FenwickTree(int n) {
            sums = new int[n+1];
        }

        public void update(int i, int delta) {
            while(i < sums.length) {
                sums[i] += delta;
                i += lowbit(i);
            }
        }

        public int query(int i) {
            int sum = 0;
            while(i > 0) {
                sum += sums[i];
                i -= lowbit(i);
            }
            return sum;
        }

        private int lowbit(int x) {
            return x & (-x);
        }
    }
}
// @lc code=end

