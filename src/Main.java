//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        tree.inOrder();
        System.out.println("Preorder tree");
        tree.preOrder();
        System.out.println("Postorder tree");
        tree.postOrder();

        int findValue = 22;
        if(tree.search(findValue)){
            System.out.println("Found Value " + findValue);
        }
        else{
            System.out.println("Not Found Value " + findValue);
        }
        System.out.println("Minimum value from tree "+tree.findMin());
        System.out.println("Maximum value from tree "+tree.findMax());
    }
}
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value)
        {
            this.value = value;
            left = right = null;
        }

    }
    class BinaryTree
    {
        Node root;
        public BinaryTree()
        {
            this.root = null;
        }
        private Node insertNode(Node root, int value)
        {
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
        public void insert(int value)
        {
            root = insertNode(root, value);
        }

        private void inOrderRec(Node root)
        {
            if(root!=null)
            {
                inOrderRec(root.left);
                System.out.println(root.value+" ");
                inOrderRec(root.right);
            }
        }

        private void preOrderRec(Node root)
        {
            if(root!=null)
            {
                System.out.println(root.value+" ");
                preOrderRec(root.left);
                preOrderRec(root.right);
            }
        }
        private void postOrderRec(Node root)
        {
            if(root!=null)
            {
                postOrderRec(root.left);
                postOrderRec(root.right);
                System.out.println(root.value+" ");
            }
        }
        public void inOrder()
        {
            inOrderRec(root);
        }
        public void preOrder()
        {
            preOrderRec(root);
        }
        public void postOrder()
        {
            postOrderRec(root);
        }
        private boolean searchRec(Node root, int value)
        {
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
        public boolean search(int value)
        {
           return searchRec(root, value);
        }
        private int findMinRec(Node root)
        {
            if(root==null)
                return -1;
            if(root.left==null)
                return root.value;
            return findMinRec(root.left);
        }
        private int findMaxRec(Node root)
        {
            if(root==null)
                return -1;
            if(root.right==null)
                return root.value;
            return findMaxRec(root.right);
        }
        public int findMin()
        {
            return findMinRec(root);
        }
        public int findMax()
        {
            return findMaxRec(root);
        }
    }
