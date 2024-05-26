package Tree;

public class BinaryTree {

    public Node root;

    public BinaryTree(){
        root = null;
    }

    public void insertNewData(int data){

        Node tempNode = new Node(data);
        Node current = root, parent = null;

        if (root == null){
            root = tempNode;
            return;
        }

        while (true){
            parent = current;

            if (current.data < data) {
                current = current.right;

                if (current == null){
                    parent.right = new Node(data);
                    return;
                }
            }
            else {
                current = current.left;
                if (current == null){
                    parent.left = new Node(data);
                    return;
                }
            }
        }
    }

    public Node maxNode(Node root){
        if (root != null)
            maxNode(root.right);
        return root;
    }

    public Node minNode(Node root){
        if (root != null)
            minNode(root.left);
        return root;
    }

    public void inorderTraversal(Node node){

        if (node == null){
            System.out.println("Tree is empty.");
        }

        else{

            if (node.left != null)
                inorderTraversal(node.left);
            System.out.println("Data: " + node.data);
            if (node.right != null)
                inorderTraversal(node.right);

        }
    }
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNewData(10);
        binaryTree.insertNewData(5);
        binaryTree.insertNewData(12);
        binaryTree.insertNewData(17);

        binaryTree.inorderTraversal(binaryTree.root);
    }
}
