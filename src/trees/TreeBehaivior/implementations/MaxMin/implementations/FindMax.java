package trees.TreeBehaivior.implementations.MaxMin.implementations;

import trees.TreeBehaivior.implementations.MaxMin.interfaces.FindMaxInterface;
import trees.tree.Node;

public class FindMax implements FindMaxInterface {
    @Override
    public int findMaxRec(Node root) {
        if(root==null)
            return -1;
        if(root.right==null)
            return root.value;
        return findMaxRec(root.right);
    }
}
