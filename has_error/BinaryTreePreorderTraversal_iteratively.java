import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal_iteratively {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
        //nodes.add(root);
        TreeNode temp = root;
        while (temp != null){
            output.add(temp.val);
            if (temp.left != null){
                if (temp.right != null)
                    nodes.add(temp.right);
                temp = temp.left;
            }
            else if (temp.right != null){
                temp = temp.right;
            }
            else {
                if (nodes.size() != 0){
                    temp = nodes.remove(nodes.size()-1);
                }
                else
                    temp = null;
            }
        }
        return output;

    }
}
