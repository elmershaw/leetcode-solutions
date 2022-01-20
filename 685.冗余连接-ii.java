/*
 * @lc app=leetcode.cn id=685 lang=java
 *
 * [685] 冗余连接 II
 */

// @lc code=start
class Solution {
<<<<<<< HEAD
    public int[] findRedundantDirectedConnection(int[][] edges) {
        UnionFind uf = new UnionFind(n)
    }

    class UnionFind {
        private int[] parent;
        private int[] rank;

        UnionFind(int n) {
            rank = new int[n];
            parent = new int[n];
=======
    FindUnion fu;

    public int[] findRedundantDirectedConnection(int[][] edges) {
        fu = new FindUnion(edges.length + 1);
        int[] inDegree = new int[edges.length + 1];
        for(int i = 0; i < edges.length; i++)
        {
            // 入度
            inDegree[ edges[i][1] ] += 1;
        }

        // 找入度为2的节点所对应的边，注意要倒序，因为优先返回最后出现在二维数组中的答案
        ArrayList<Integer> twoDegree = new ArrayList<Integer>();
        for(int i = edges.length - 1; i >= 0; i--)
        {
            if(inDegree[edges[i][1]] == 2) {
                twoDegree.add(i);
            }
        }

        // 处理图中情况1 和 情况2
        // 如果有入度为2的节点，那么一定是两条边里删一个，看删哪个可以构成树
        if(!twoDegree.isEmpty())
        {
            if(isTreeAfterRemoveEdge(edges, twoDegree.get(0))) {
                return edges[ twoDegree.get(0)];
            }
            return edges[ twoDegree.get(1)];
        }

        // 明确没有入度为2的情况，那么一定有有向环，找到构成环的边返回就可以了
        return getRemoveEdge(edges);
    }

    private int[] getRemoveEdge(int[][] edges) {
        for(int i = 0; i < edges.length; i++) {
            if(fu.find(edges[i][0]) == fu.find(edges[i][1])) { // 构成有向环了，就是要删除的边
                return edges[i];
            }
            fu.union(edges[i][0], edges[i][1]);
        }
        return null;
    }

    /**
     * 删一条边之后判断是不是树
     * @param edges
     * @param deleteEdge 要删除的边
     * @return  true: 是树， false： 不是树
     */
    private Boolean isTreeAfterRemoveEdge(int[][] edges, int deleteEdge)
    {
        for(int i = 0; i < edges.length; i++)
        {
            if(i == deleteEdge) continue;
            if(fu.find(edges[i][0]) == fu.find(edges[i][1])) { // 构成有向环了，一定不是树
                return false;
            }
            fu.union(edges[i][0], edges[i][1]);
        }
        return true;
    }

    class FindUnion {
        private int[] parent;
        // private int[] rank;

        FindUnion(int n) {
            parent = new int[n];
            // rank = new int[n];
>>>>>>> cb5f86a (add solutions from home PC)
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

<<<<<<< HEAD
            if (rank[xp] > rank[yp]) {
                parent[yp] = xp;
            } else if (rank[xp] < rank[yp]) {
                parent[xp] = yp;
            } else {
                parent[xp] = yp;
                rank[yp]++;
            }
=======
            parent[yp] = xp;

            // if (rank[xp] > rank[yp]) {
            //     parent[yp] = xp;
            // } else if (rank[xp] < rank[yp]) {
            //     parent[xp] = yp;
            // } else {
            //     parent[xp] = yp;
            //     rank[yp]++;
            // }
>>>>>>> cb5f86a (add solutions from home PC)
            return true;
        }
    }
}
// @lc code=end

