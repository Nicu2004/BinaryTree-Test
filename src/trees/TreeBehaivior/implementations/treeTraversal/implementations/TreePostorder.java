package trees.TreeBehaivior.implementations.treeTraversal.implementations;

import trees.TreeBehaivior.implementations.treeTraversal.interfaces.TreePostorederInterface;
import trees.tree.Node;

public class TreePostorder implements TreePostorederInterface {
    @Override
    public void postorder(Node root) {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.value+" ");
        }
    }
}
