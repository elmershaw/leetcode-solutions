import java.util.List;

/*
 * @lc app=leetcode.cn id=841 lang=java
 *
 * [841] 钥匙和房间
 */

// @lc code=start
class Solution {
    private boolean[] visited;
    private int accessible = 1;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        visit(rooms, 0);
        return accessible == rooms.size();
    }

    private void visit(List<List<Integer>> rooms, int r) {
        for (Integer key : rooms.get(r)) {
            if (!visited[key]) {
                // System.out.println(key);
                visited[key] = true;
                accessible++;
                visit(rooms, key);
            }
        }
    }
}
// @lc code=end

