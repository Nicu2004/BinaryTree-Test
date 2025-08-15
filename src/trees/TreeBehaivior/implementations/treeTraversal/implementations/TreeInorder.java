package trees.TreeBehaivior.implementations.treeTraversal.implementations;

import trees.TreeBehaivior.implementations.treeTraversal.interfaces.TreeInorderInterface;
import trees.tree.Node;

public class TreeInorder implements TreeInorderInterface {
    @Override
    public void inorder(Node root) {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.value+" ");
            inorder(root.right);
        }

    }
}
