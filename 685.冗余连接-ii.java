/*
 * @lc app=leetcode.cn id=685 lang=java
 *
 * [685] 冗余连接 II
 */

// @lc code=start
class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        UnionFind uf = new UnionFind(n)
    }

    class UnionFind {
        private int[] parent;
        private int[] rank;

        UnionFind(int n) {
            rank = new int[n];
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public boolean union(int x, int y) {
            int xp = find(x);
            int yp = find(y);

            if (xp == yp) {
                return false;
            }

            if (rank[xp] > rank[yp]) {
                parent[yp] = xp;
            } else if (rank[xp] < rank[yp]) {
                parent[xp] = yp;
            } else {
                parent[xp] = yp;
                rank[yp]++;
            }
            return true;
        }
    }
}
// @lc code=end

