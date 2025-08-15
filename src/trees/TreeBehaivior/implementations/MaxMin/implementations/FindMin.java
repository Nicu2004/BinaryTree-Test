package trees.TreeBehaivior.implementations.MaxMin.implementations;

import trees.TreeBehaivior.implementations.MaxMin.interfaces.FindMinInterface;
import trees.tree.Node;

public class FindMin implements FindMinInterface {
    @Override
    public int findMinRec(Node root) {
        if(root==null)
            return -1;
        if(root.right==null)
            return root.value;
        return findMinRec(root.right);
    }
}
