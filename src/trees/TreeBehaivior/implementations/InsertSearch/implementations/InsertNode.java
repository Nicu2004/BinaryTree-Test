package trees.TreeBehaivior.implementations.InsertSearch.implementations;

import trees.TreeBehaivior.implementations.InsertSearch.interfaces.InsertNodeInterface;
import trees.tree.Node;

public class InsertNode implements InsertNodeInterface {
    @Override
    public Node insertNode(Node root, int value) {
        if(root==null)
        {
            root = new Node(value);
            return root;
        }
        if(value<root.value)
            root.left = insertNode(root.left, value);
        else if(value>root.value)
            root.right = insertNode(root.right, value);
        return root;
    }
}
