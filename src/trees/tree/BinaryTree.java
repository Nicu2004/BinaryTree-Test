package trees.tree;
import trees.TreeBehaivior.implementations.InsertSearch.implementations.InsertNode;
import trees.TreeBehaivior.implementations.InsertSearch.implementations.SearchNode;
import trees.TreeBehaivior.implementations.MaxMin.implementations.FindMax;
import trees.TreeBehaivior.implementations.MaxMin.implementations.FindMin;
import trees.TreeBehaivior.implementations.treeTraversal.implementations.TreeInorder;
import trees.TreeBehaivior.implementations.treeTraversal.implementations.TreePostorder;
import trees.TreeBehaivior.implementations.treeTraversal.implementations.TreePreorder;


public class BinaryTree{

    Node root;
    FindMax findMax;
    FindMin findMin;
    InsertNode insertNode;
    SearchNode searchNode;

    TreeInorder treeInorder;
    TreePreorder treePreorder;
    TreePostorder treePostorder;
    public BinaryTree() {

            findMax = new FindMax();
            findMin = new FindMin();
            insertNode = new InsertNode();
            searchNode = new SearchNode();
            treeInorder = new TreeInorder();
            treePreorder = new TreePreorder();
            treePostorder = new TreePostorder();
            this.root = null;
    }
    public void insert(int value) {
        this.root = insertNode.insertNode(root, value);
    }
    public int findMax() {
        return findMax.findMaxRec(root);
    }
    public int  findMin() {
        return findMin.findMinRec(root);
    }
    public boolean searchNode(int value) {
        System.out.println(searchNode.searchRec(root, value));
        return false;
    }
    public void treeInorder() {
        treeInorder.inorder(root);
    }
    public void treePreorder() {
        treePreorder.preorder(root);
    }
    public void treePostorder() {
        treePostorder.postorder(root);
    }

}