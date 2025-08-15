import trees.tree.BinaryTree;

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(22);
        tree.insert(30);
        tree.insert(40);
        tree.insert(11);
        tree.insert(51);
        tree.insert(6);
        tree.insert(7);
        tree.insert(1);
        tree.insert(16);

        System.out.println("Inorder tree");
        tree.treeInorder();
        System.out.println("Preorder tree");
        tree.treePreorder();
        System.out.println("Postorder tree");
        tree.treePostorder();

        int findValue = 22;
        if(tree.searchNode(findValue)){
            System.out.println("Found Value " + findValue);
        }
        else{
            System.out.println("Not Found Value " + findValue);
        }
        System.out.println("Minimum value from tree "+tree.findMin());
        System.out.println("Maximum value from tree "+tree.findMax());
    }
}

