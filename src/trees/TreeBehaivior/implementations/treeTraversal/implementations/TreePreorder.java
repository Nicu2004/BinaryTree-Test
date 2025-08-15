package trees.TreeBehaivior.implementations.treeTraversal.implementations;
import trees.TreeBehaivior.implementations.treeTraversal.interfaces.TreePreorderInterface;
import trees.tree.Node;
public class TreePreorder implements TreePreorderInterface {
    @Override
    public void preorder(Node root) {
        if(root!=null)
        {
            System.out.println(root.value+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
