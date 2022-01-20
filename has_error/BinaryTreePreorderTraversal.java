import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> output = new ArrayList<>();
        if (root == null)
            return output;
        traversal(root, output);
        return output;

    }

    public void traversal(TreeNode root, ArrayList<Integer> output){
        output.add(root.val);
        if (root.left != null){
            traversal(root.left,output);
        }
        if (root.right != null)
            traversal(root.right,output);
    }
}
