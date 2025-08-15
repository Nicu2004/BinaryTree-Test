package trees.TreeBehaivior.implementations.InsertSearch.implementations;

import trees.tree.Node;
import trees.TreeBehaivior.implementations.InsertSearch.interfaces.SearchNodeInterface;

public class SearchNode implements SearchNodeInterface {
    @Override
    public boolean searchRec(Node root, int value) {
        if(root==null)
            return false;
        if(value==root.value)
            return true;
        if(value<root.value)
        {
            return searchRec(root.left, value);
        }
        return searchRec(root.right, value);

    }
}
