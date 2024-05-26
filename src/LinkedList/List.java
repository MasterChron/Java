package LinkedList;

import Polymorphism.A;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();

        List ls = new List();
        ls.addToList(nodes, 10, 2, 10);

        ls.traversal(nodes.getFirst());
    }

    public void traversal(Node firstNode) {
        Node temp = firstNode;

        while (temp != null){
            System.out.println(temp.data);
        temp = temp.next;
        }
    }

    public void addToList(ArrayList<Node> arr, int numOfNodes, int value, int increment){
        arr.add(new Node(value));
        value *= increment;
        int i;
        for (i = 1; i < numOfNodes; i++){
            arr.add(new Node(value));
            arr.get(i - 1).next = arr.get(i);
            value *= increment;
        }
        arr.get(i - 1).next = null;
    }
}
