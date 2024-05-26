package Tree;

public class TreeNode {

    int data;

    public TreeNode childOne;
    public TreeNode childTwo;
    public TreeNode childThree;

    public TreeNode(int data){
        this.data = data;
        childOne = null;
        childTwo = null;
        childThree = null;
    }

    void display(){
        System.out.println(data + "--");
    }

    public TreeNode createChildNode(int value){
        return new TreeNode(value);
    }
}

class Main{

    public static void main(String[] args) {
        System.out.println("Simple tree.");

        TreeNode root = new TreeNode(12);
        root.childOne = root.createChildNode(34);
        root.childTwo = new TreeNode(15);

        root.childOne.childOne = root.createChildNode(20);
        root.childTwo.childOne = root.createChildNode(80);
        root.childTwo.childTwo = root.createChildNode(0);
        root.childTwo.childTwo.childOne = root.createChildNode(30);

        System.out.println("Root data is: ");
        root.display();

        System.out.println("\nRoot child one's, child one's data is: ");
        root.childOne.childOne.display();

        System.out.println("\nRoot child two's, child one's data is: ");
        root.childTwo.childOne.display();

        System.out.println("\nRoot child two's, child two's, child one's data is: ");
        root.childTwo.childTwo.childOne.display();
    }
}
